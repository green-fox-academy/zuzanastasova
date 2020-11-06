package com.greenfoxacademy.todowithmysql.controllers;

import com.greenfoxacademy.todowithmysql.models.Assignee;
import com.greenfoxacademy.todowithmysql.services.AssigneeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class AssigneeController {

    private final AssigneeService assigneeService;

    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @GetMapping("/listAssignee")
    public String list(Model model){
        model.addAttribute("list", assigneeService.findAllAssignees());
        return "listAssignee";
    }


    @PostMapping("/addAssignee")
    public String addAssignee(@ModelAttribute Assignee assignee) {
        assigneeService.addAssignee(assignee);
        return "redirect:/listAssignee";
    }

    @GetMapping("/assignee/{id}/delete")
    public String deleteAssignee(@PathVariable Long id) {
        assigneeService.deleteByIdAssignee(id);
        return "redirect:/listAssignee";
    }

    @GetMapping("/assignee/{id}/edit")
    public String getEditFormAssignee(Model model, @PathVariable Long id) {
        Optional<Assignee> assignee = assigneeService.findByIdAssignee(id);
        if(assignee.isPresent()) {
            model.addAttribute("assignee", assignee.get());
            return "edit-assignee";
        }
        return "redirect:/listAssignee";
    }

    @PostMapping("/assignee/{id}/edit")
    public String editAssignee(@ModelAttribute Assignee assignee) {
        assigneeService.addAssignee(assignee);
        return "redirect:/listAssignee";
    }
}
