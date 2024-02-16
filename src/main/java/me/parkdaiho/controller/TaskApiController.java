package me.parkdaiho.controller;

import lombok.RequiredArgsConstructor;
import me.parkdaiho.dto.AddTaskRequest;
import me.parkdaiho.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class TaskApiController {

    private final TaskService taskService;

    @PostMapping("/api/task")
    public ResponseEntity<?> addTask(@RequestBody AddTaskRequest request) {
        taskService.addTask(request);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/api/task/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);

        return ResponseEntity.ok().build();
    }
}
