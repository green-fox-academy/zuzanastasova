package com.greenfoxacademy.todowithmysql.repositories;

import com.greenfoxacademy.todowithmysql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findAllByTitleContainingIgnoreCase(String title);

}

