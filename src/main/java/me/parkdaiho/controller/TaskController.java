package me.parkdaiho.controller;

import lombok.RequiredArgsConstructor;
import me.parkdaiho.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("tasks", taskService.findAll());

        return "index";
    }
}
