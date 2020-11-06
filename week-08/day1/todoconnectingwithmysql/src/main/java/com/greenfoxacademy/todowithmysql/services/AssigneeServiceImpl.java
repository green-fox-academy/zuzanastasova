package com.greenfoxacademy.todowithmysql.services;

import com.greenfoxacademy.todowithmysql.models.Assignee;
import com.greenfoxacademy.todowithmysql.models.Todo;
import com.greenfoxacademy.todowithmysql.repositories.AssigneeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AssigneeServiceImpl implements AssigneeService{

    private final AssigneeRepository assigneeRepository;

    public AssigneeServiceImpl(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    public List<Assignee> findAllAssignees(){
        return new ArrayList<>(assigneeRepository.findAll());
    }

    public void addAssignee(Assignee assignee){
            assigneeRepository.save(assignee);
    }

    public void deleteByIdAssignee(Long id){
        assigneeRepository.deleteById(id);
    }

    public Optional<Assignee> findByIdAssignee(Long id) {
        return assigneeRepository.findById(id);
    }

}
