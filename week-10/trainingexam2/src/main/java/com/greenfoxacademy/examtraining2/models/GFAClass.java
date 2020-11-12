package com.greenfoxacademy.examtraining2.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class GFAClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "GfaClass")
    private List<Mentor> mentors;

    public List<Mentor> getMentors() {
        return mentors;
    }

    public void setMentors(List<Mentor> mentors) {
        this.mentors = mentors;
    }

    public GFAClass() {
    }

    public GFAClass(String name) {
        this.id = null;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMentor(Mentor mentor) {
        this.mentors.add(mentor);
    }
}
