package com.greenfoxacademy.todowithmysql.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Todo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private boolean urgent;
    private boolean done;

    @ManyToOne()
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Todo() {

    }

    public Todo(Long id, String title, boolean urgent, boolean done) {
        this.id = id;
        this.title = title;
        this.urgent = urgent;
        this.done = done;

    }

    public Todo(String title, boolean urgent, boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;

    }

    public Todo(String title) {
        this.title = title;
        this.urgent = false;
        this.done = false;

    }

    public Todo(String title, boolean urgent) {
        this.title = title;
        this.urgent = urgent;
        this.done = false;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
