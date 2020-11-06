package com.greenfoxacademy.todowithmysql.repositories;

import com.greenfoxacademy.todowithmysql.models.Assignee;
import com.greenfoxacademy.todowithmysql.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends JpaRepository<Assignee, Long> {
}
