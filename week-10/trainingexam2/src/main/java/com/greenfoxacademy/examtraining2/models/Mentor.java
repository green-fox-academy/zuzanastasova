package com.greenfoxacademy.examtraining2.models;

import javax.persistence.*;

@Entity
public class Mentor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    private GFAClass GfaClass;

    public GFAClass getGfaClass() {
        return GfaClass;
    }
    public void setGfaClass(GFAClass gfaClass) {
        GfaClass = gfaClass;
        gfaClass.addMentor(this);
    }

    public Mentor() {
    }

    public Mentor(String name) {
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


}
