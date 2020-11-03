package com.greenfoxacademy.frontend.repositories;

import com.greenfoxacademy.frontend.models.LogEntries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface LogEntriesRepository extends JpaRepository<LogEntries, Long> {

    List<LogEntries> logEntries = new ArrayList<>();

}
