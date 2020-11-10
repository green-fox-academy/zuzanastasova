package com.greenfoxacademy.chatproject.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateRequestDTO {

    private String username;
    private String avatarUrl;

    public UpdateRequestDTO() {
    }

    public UpdateRequestDTO(String username, String avatarUrl) {
        this.username = username;
        this.avatarUrl = avatarUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
