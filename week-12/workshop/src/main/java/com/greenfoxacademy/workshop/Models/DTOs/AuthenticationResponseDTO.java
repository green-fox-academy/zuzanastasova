package com.greenfoxacademy.workshop.Models.DTOs;

public class AuthenticationResponseDTO {

    private final String jwt;

    public AuthenticationResponseDTO(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
