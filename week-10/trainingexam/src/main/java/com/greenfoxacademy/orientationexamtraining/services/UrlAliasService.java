package com.greenfoxacademy.orientationexamtraining.services;

import com.greenfoxacademy.orientationexamtraining.models.UrlAlias;

import java.util.List;

public interface UrlAliasService {

    void saveUrlAlias(UrlAlias urlAlias);
    List<UrlAlias> getAllUrlAliases();
    Boolean isUrlAliasExistingByAlias(String alias);
    UrlAlias findUrlAliasByAlias(String alias);
    void deleteUrlAlias(Long id);
    UrlAlias findUrlAliasById(Long id);
    Boolean isUrlAliasExistingById(Long id);

}
