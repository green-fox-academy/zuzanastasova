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

    public String getSecreteCode(UrlAlias urlAlias){
        return urlAlias.getSecreteCode();
    }

    public Boolean isUrlAlias(String alias) {
        return urlAliasRepository.existsUrlAliasByAlias(alias);
    }
}
