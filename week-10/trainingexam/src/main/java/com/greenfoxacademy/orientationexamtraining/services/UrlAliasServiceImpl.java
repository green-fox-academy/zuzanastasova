package com.greenfoxacademy.orientationexamtraining.services;

import com.greenfoxacademy.orientationexamtraining.models.UrlAlias;
import com.greenfoxacademy.orientationexamtraining.repositories.UrlAliasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlAliasServiceImpl implements UrlAliasService{

    private final UrlAliasRepository urlAliasRepository;

    public UrlAliasServiceImpl(UrlAliasRepository urlAliasRepository) {
        this.urlAliasRepository = urlAliasRepository;
    }

    public List<UrlAlias> getAllUrlAliases(){
        return urlAliasRepository.findAll();
    }

    public void saveUrlAlias(UrlAlias urlAlias){
        urlAliasRepository.save(urlAlias);
    }

    public Boolean isUrlAliasExistingByAlias(String alias) {
        return urlAliasRepository.existsUrlAliasByAlias(alias);
    }

    public UrlAlias findUrlAliasByAlias(String alias) {
        return urlAliasRepository.findUrlAliasByAlias(alias);
    }

    public void deleteUrlAlias(Long id) {
        urlAliasRepository.deleteById(id);
    }

    public UrlAlias findUrlAliasById(Long id) {
        return urlAliasRepository.findUrlAliasById(id);
    }

    public Boolean isUrlAliasExistingById(Long id) {
        return urlAliasRepository.existsUrlAliasById(id);
    }
}
