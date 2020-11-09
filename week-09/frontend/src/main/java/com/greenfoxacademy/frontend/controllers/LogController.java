package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.LogEntries;
import com.greenfoxacademy.frontend.models.LogEntriesDTO;
import com.greenfoxacademy.frontend.services.LogEntriesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class LogController {

    private final LogEntriesService logEntriesService;

    public LogController(LogEntriesService logEntriesService) {
        this.logEntriesService = logEntriesService;
    }

    @ResponseBody
    @GetMapping("/log")
    public LogEntriesDTO logEntries(){
        List<LogEntries> entries = logEntriesService.findAllLogs();
        int entry_count = logEntriesService.findAllLogs().size();
        return new LogEntriesDTO(entries, entry_count);
    }
}
