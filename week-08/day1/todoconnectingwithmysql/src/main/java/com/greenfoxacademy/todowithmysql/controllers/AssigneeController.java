package com.greenfoxacademy.todowithmysql.controllers;

import com.greenfoxacademy.todowithmysql.services.AssigneeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AssigneeController {

    private final AssigneeService assigneeService;

    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @GetMapping("/assigneelist")
    public String list(Model model){
        model.addAttribute("assignees", assigneeService.findAllAssignees());
        return "assigneelist";
    }
}
