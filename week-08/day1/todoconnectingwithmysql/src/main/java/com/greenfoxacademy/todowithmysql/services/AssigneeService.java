package com.greenfoxacademy.todowithmysql.services;

import com.greenfoxacademy.todowithmysql.models.Assignee;
import com.greenfoxacademy.todowithmysql.models.Todo;

import java.util.List;
import java.util.Optional;

public interface AssigneeService {

    public List<Assignee> findAllAssignees();
    public void addAssignee(Assignee assignee);
    public void deleteByIdAssignee(Long id);
    public Optional<Assignee> findByIdAssignee(Long id);
}
