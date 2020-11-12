package com.greenfoxacademy.examtraining2.repositories;

import com.greenfoxacademy.examtraining2.models.GFAClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<GFAClass, Long> {

    GFAClass findGFAClassByName(String name);
    @Query(value = "SELECT id FROM gfaclass where name=?",nativeQuery = true)
    Long findClassIdByClassName(String className);
}
