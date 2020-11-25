package com.greenfoxacademy.workshop.Models.DTOs;

public class RegisterDTO {

    private String registerUserName;
    private String registerPassword;

    public RegisterDTO() {
    }

    public RegisterDTO(String registerUserName, String registerPassword) {
        this.registerUserName = registerUserName;
        this.registerPassword = registerPassword;
    }

    public String getRegisterUserName() {
        return registerUserName;
    }

    public void setRegisterUserName(String registerUserName) {
        this.registerUserName = registerUserName;
    }

    public String getRegisterPassword() {
        return registerPassword;
    }

    public void setRegisterPassword(String registerPassword) {
        this.registerPassword = registerPassword;
    }
}
