package com.greenfoxacademy.todowithmysql.services;

import com.greenfoxacademy.todowithmysql.models.Assignee;
import com.greenfoxacademy.todowithmysql.models.Todo;

import java.util.List;

public interface AssigneeService {

    public List<Assignee> findAllAssignees();
}
