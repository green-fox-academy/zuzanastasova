package com.greenfoxacademy.examtraining2.services;

import com.greenfoxacademy.examtraining2.DTOs.MentorDTO;
import com.greenfoxacademy.examtraining2.models.GFAClass;
import com.greenfoxacademy.examtraining2.models.Mentor;
import com.greenfoxacademy.examtraining2.repositories.MentorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MentorServiceImpl implements MentorService{

    private final MentorRepository mentorRepository;
    private final ClassService classService;

    public MentorServiceImpl(MentorRepository mentorRepository, ClassService classService) {
        this.mentorRepository = mentorRepository;
        this.classService = classService;
    }

    @Override
    public List<Mentor> findAllMentors() {
        return mentorRepository.findAll();
    }

    public Long saveMentorWithClassName(MentorDTO mentorDTO) {
        Mentor mentor = new Mentor(mentorDTO.getName());
        GFAClass gfaClass = classService.findClassByName(mentorDTO.getClassName());
        mentor.setGfaClass(gfaClass);
        mentor = mentorRepository.save(mentor);
        return mentor.getId();
    }

    public Boolean existsMentorByName(String name) {
        return mentorRepository.existsMentorByName(name);
    }

    public Mentor findMentorById(Long id) {
        return mentorRepository.findMentorById(id);
    }

    public List<MentorDTO> getMentorsInClass(String className) {
        Long id = classService.findClassIdByClassName(className);

        var mentors = mentorRepository.findAll();

        List<MentorDTO> mentorDtoList = mentors.stream()
                .map(MentorDTO::new)
                .collect(Collectors.toList());

        List<MentorDTO> list =mentorDtoList.stream()
                .filter(mentorDto1 -> mentorDto1.getGfaClass().getId() == id)
                .collect(Collectors.toList());
        return list;
    }
}
