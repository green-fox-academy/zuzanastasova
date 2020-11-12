package com.greenfoxacademy.orientationexamtraining.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Random;

@Entity
public class UrlAlias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    private String alias;
    private int hitCount;
    @JsonIgnore
    private String secretCode;

    public UrlAlias() {
        Random r = new Random();
        this.secretCode = String.format("%04d", r.nextInt(1001));
    }

    public UrlAlias(String url, String alias, int hitCount) {
        this.id = null;
        this.url = url;
        this.alias = alias;
        this.hitCount = hitCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }

    public String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(String secreteCode) {
        this.secretCode = secreteCode;
    }
}
