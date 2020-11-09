package com.greenfoxacademy.chatproject.models;

public class UserLoginResponseDTO {

    private String apiKey;

    public UserLoginResponseDTO() {
    }

    public UserLoginResponseDTO(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
