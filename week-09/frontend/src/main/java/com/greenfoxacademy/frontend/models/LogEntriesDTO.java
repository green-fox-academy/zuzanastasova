package com.greenfoxacademy.frontend.models;

import org.springframework.stereotype.Component;

import java.util.List;

public class LogEntriesDTO {

    List<LogEntries> logEntries;
    int entry_count;

    public LogEntriesDTO(List<LogEntries> logEntries, int entry_count) {
        this.logEntries = logEntries;
        this.entry_count = entry_count;
    }

    public List<LogEntries> getLogEntries() {
        return logEntries;
    }

    public void setLogEntries(List<LogEntries> logEntries) {
        this.logEntries = logEntries;
    }

    public int getEntry_count() {
        return entry_count;
    }

    public void setEntry_count(int entry_count) {
        this.entry_count = entry_count;
    }
}
