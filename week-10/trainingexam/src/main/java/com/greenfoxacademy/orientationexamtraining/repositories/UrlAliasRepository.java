package com.greenfoxacademy.orientationexamtraining.repositories;

import com.greenfoxacademy.orientationexamtraining.models.UrlAlias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlAliasRepository extends JpaRepository<UrlAlias, Long> {

    Boolean existsUrlAliasByAlias(String alias);

}
