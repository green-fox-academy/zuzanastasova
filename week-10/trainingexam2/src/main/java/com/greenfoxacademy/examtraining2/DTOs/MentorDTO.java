package com.greenfoxacademy.examtraining2.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.greenfoxacademy.examtraining2.models.GFAClass;
import com.greenfoxacademy.examtraining2.models.Mentor;

public class MentorDTO {

    private String name;
    @JsonIgnore
    private String className;
    @JsonIgnore
    private GFAClass gfaClass;
    @JsonIgnore
    private Long id;

    public MentorDTO() {
    }

    public MentorDTO(String name, String className) {
        this.name = name;
        this.className = className;
    }

    public MentorDTO(Mentor mentor) {
        this.name = mentor.getName();
        this.id = mentor.getId();
        this.gfaClass = mentor.getGfaClass();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public GFAClass getGfaClass() {
        return gfaClass;
    }

    public void setGfaClass(GFAClass gfaClass) {
        this.gfaClass = gfaClass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
