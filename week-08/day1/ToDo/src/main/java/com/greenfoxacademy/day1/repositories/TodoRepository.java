package com.greenfoxacademy.day1.repositories;

import com.greenfoxacademy.day1.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
    
}
