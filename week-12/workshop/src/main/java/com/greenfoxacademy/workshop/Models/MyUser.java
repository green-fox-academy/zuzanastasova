package com.greenfoxacademy.workshop.Models;

import com.greenfoxacademy.workshop.Models.DTOs.RegisterDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String userName;
    private String passWord;

    public MyUser() {
    }

    public MyUser(RegisterDTO registerDTO) {
        this.userName = registerDTO.getRegisterUserName();
        this.passWord = registerDTO.getRegisterPassword();
    }

    public MyUser(String userName, String passWord) {
        Id = null;
        this.userName = userName;
        this.passWord = passWord;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
