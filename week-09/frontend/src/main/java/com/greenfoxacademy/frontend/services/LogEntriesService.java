package com.greenfoxacademy.frontend.services;

import com.greenfoxacademy.frontend.models.LogEntries;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LogEntriesService {

    public LogEntries saveLog(LogEntries log);
    public List<LogEntries> findAllLogs();

}
