package com.greenfoxacademy.chatproject.models;

public class Channel {

    private Long id;
    private String name;
    private String description;
    private String admin;
    private String iconUrl;
    private String secret;

    public Channel() {
    }

    public Channel(Long id, String name, String description, String admin, String iconUrl, String secret) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.admin = admin;
        this.iconUrl = iconUrl;
        this.secret = secret;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
