package com.greenfoxacademy.chatproject.models;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class MessageResponseDTO {

    private String content;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    private UpdateResponseDTO author;

    public MessageResponseDTO() {
    }

    public MessageResponseDTO(String content, UpdateResponseDTO author) {
        this.content = content;
        this.date = null;
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UpdateResponseDTO getAuthor() {
        return author;
    }

    public void setAuthor(UpdateResponseDTO author) {
        this.author = author;
    }
}
