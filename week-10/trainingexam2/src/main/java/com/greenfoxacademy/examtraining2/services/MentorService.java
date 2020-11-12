package com.greenfoxacademy.examtraining2.services;

import com.greenfoxacademy.examtraining2.DTOs.MentorDTO;
import com.greenfoxacademy.examtraining2.models.Mentor;

import java.util.List;

public interface MentorService {
    List<Mentor> findAllMentors();
    Long saveMentorWithClassName(MentorDTO mentorDTO);
    Boolean existsMentorByName(String name);
    Mentor findMentorById(Long id);
}
