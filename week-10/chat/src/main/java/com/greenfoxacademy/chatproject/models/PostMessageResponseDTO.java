package com.greenfoxacademy.chatproject.models;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class PostMessageResponseDTO {

    private String content;
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    private UserUpdateResponseDTO author;

    public PostMessageResponseDTO() {
    }

    public PostMessageResponseDTO(String content, UserUpdateResponseDTO author) {
        this.content = content;
        this.created = null;
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public UserUpdateResponseDTO getAuthor() {
        return author;
    }

    public void setAuthor(UserUpdateResponseDTO author) {
        this.author = author;
    }
}
