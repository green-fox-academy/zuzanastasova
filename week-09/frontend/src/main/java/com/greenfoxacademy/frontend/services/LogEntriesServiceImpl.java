package com.greenfoxacademy.frontend.services;

import com.greenfoxacademy.frontend.models.LogEntries;
import com.greenfoxacademy.frontend.repositories.LogEntriesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogEntriesServiceImpl implements LogEntriesService{

    private final LogEntriesRepository logEntriesRepository;

    public LogEntriesServiceImpl(LogEntriesRepository logEntriesRepository) {
        this.logEntriesRepository = logEntriesRepository;
    }

    public LogEntries saveLog(LogEntries log){
        return logEntriesRepository.save(log);
    }

    public List<LogEntries> findAllLogs() {
        return logEntriesRepository.findAll();
    }

}
