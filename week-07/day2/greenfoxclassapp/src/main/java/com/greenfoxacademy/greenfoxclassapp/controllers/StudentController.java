package com.greenfoxacademy.greenfoxclassapp.controllers;

import com.greenfoxacademy.greenfoxclassapp.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/gfa")
    public String homePage(Model model){
        model.addAttribute("studentsCount", studentService.count());
        return "index";
    }

    @GetMapping("/gfa/list")
    public String allStudents(Model model){
        model.addAttribute("students", studentService.findAll());
        return "gfaAllStudents";
    }

    @GetMapping("/gfa/add")
    public String addStudent(){
        return "gfaAddStudent";
    }

    @PostMapping("/gfa/save")
    public String saveStudent(String name){
        studentService.save(name);
        return "redirect:/gfa/list";
    }

    @GetMapping("/gfa/check")
    public String nameToCheck(){
        return "checkName";
    }

    @PostMapping("/gfa/check")
    public String checkStudentsName(Model model, String name){
        model.addAttribute("name", name);
        model.addAttribute("check", studentService.check(name));
        return "checkName";
    }
}
