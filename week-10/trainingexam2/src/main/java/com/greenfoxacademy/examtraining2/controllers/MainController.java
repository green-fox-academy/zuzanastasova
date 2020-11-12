package com.greenfoxacademy.examtraining2.controllers;

import com.greenfoxacademy.examtraining2.DTOs.MentorDTO;
import com.greenfoxacademy.examtraining2.services.ClassService;
import com.greenfoxacademy.examtraining2.services.MentorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

    private final MentorService mentorService;
    private final ClassService classService;

    public MainController(MentorService mentorService, ClassService classService) {
        this.mentorService = mentorService;
        this.classService = classService;
    }

    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("mentors", mentorService.findAllMentors());
        model.addAttribute("classes", classService.findAllClasses());
        return "index";
    }

    @PostMapping("/mentor")
    public ModelAndView addNewMentor(@ModelAttribute MentorDTO mentorDTO){
        if(mentorService.existsMentorByName(mentorDTO.getName())) {
            return new ModelAndView("mentorexists", HttpStatus.BAD_REQUEST);
        }
        else {
            Long mentorId = mentorService.saveMentorWithClassName(mentorDTO);
            return new ModelAndView("redirect:/mentor/" + mentorId);
        }
    }

    @GetMapping("/mentor/{id}")
    public String getMentorDetailPage(@PathVariable Long id, Model model) {
        model.addAttribute("mentor", mentorService.findMentorById(id));
        return "mentordetail";
    }

    @ResponseBody
    @GetMapping ("api/mentors")
    public ResponseEntity<Object> getMentorsInClass(@RequestParam String className) {
        if(className != null) {
            return ResponseEntity.ok().body(mentorService.getMentorsInClass(className));
        } else {
            return ResponseEntity.badRequest().body(HttpStatus.BAD_REQUEST);
        }
    }
}
