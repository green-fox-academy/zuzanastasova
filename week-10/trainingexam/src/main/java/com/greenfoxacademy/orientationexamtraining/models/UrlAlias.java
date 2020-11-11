package com.greenfoxacademy.orientationexamtraining.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Random;
import java.util.function.Predicate;

@Entity
public class UrlAlias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    private String alias;
    private int hitCount;
    private String secreteCode;

    public UrlAlias() {
        Random r = new Random();
        this.secreteCode = String.format("%04d", r.nextInt(1001));
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

    public String getSecreteCode() {
        return secreteCode;
    }

    public void setSecreteCode(String secreteCode) {
        this.secreteCode = secreteCode;
    }
}
