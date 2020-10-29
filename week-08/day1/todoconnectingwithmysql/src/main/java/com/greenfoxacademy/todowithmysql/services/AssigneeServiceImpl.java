package com.greenfoxacademy.todowithmysql.services;

import com.greenfoxacademy.todowithmysql.models.Assignee;
import com.greenfoxacademy.todowithmysql.models.Todo;
import com.greenfoxacademy.todowithmysql.repositories.AssigneeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeServiceImpl implements AssigneeService{

    private final AssigneeRepository assigneeRepository;

    public AssigneeServiceImpl(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    public List<Assignee> findAllAssignees(){
        List<Assignee> assignees = new ArrayList<>();
        assigneeRepository.findAll().forEach(assignees::add);
        return assignees;
    }

}
