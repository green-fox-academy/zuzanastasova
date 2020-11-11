package com.greenfoxacademy.chatproject.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRegisterResponseDTO {

    private String username;
    private Long userId;
    private String avatarUrl;

    public UserRegisterResponseDTO() {
    }

    public UserRegisterResponseDTO(String username, Long userId, String avatarUrl) {
        this.username = username;
        this.userId = userId;
        this.avatarUrl = avatarUrl;
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

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
