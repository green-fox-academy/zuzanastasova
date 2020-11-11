package com.greenfoxacademy.orientationexamtraining.services;

import com.greenfoxacademy.orientationexamtraining.models.UrlAlias;

import java.util.List;

public interface UrlAliasService {

    void saveUrlAlias(UrlAlias urlAlias);
    public String getSecreteCode(UrlAlias urlAlias);
    public List<UrlAlias> getAllUrlAliases();
    public Boolean isUrlAlias(String alias);

}
