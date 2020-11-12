package com.greenfoxacademy.examtraining2.repositories;

import com.greenfoxacademy.examtraining2.models.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MentorRepository extends JpaRepository<Mentor, Long> {

    Boolean existsMentorByName(String name);
    Mentor findMentorById(Long id);

}
