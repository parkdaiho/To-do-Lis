package me.parkdaiho.service;

import lombok.RequiredArgsConstructor;
import me.parkdaiho.domain.Task;
import me.parkdaiho.dto.AddTaskRequest;
import me.parkdaiho.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public void addTask(AddTaskRequest request) {
        taskRepository.save(Task.builder().contents(request.getContents()).build());
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
