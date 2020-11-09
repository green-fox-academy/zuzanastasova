package com.greenfoxacademy.chatproject.models;

public class UpdateResponseDTO {

    private String username;
    private Long userId;

    public UpdateResponseDTO() {
    }

    public UpdateResponseDTO(String username, Long userId) {
        this.username = username;
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
