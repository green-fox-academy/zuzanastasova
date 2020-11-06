package com.greenfoxacademy.todowithmysql.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Assignee {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;


    public Assignee(String name, String email) {
        this.id = null;
        this.name = name;
        this.email = email;
    }

    public Assignee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
