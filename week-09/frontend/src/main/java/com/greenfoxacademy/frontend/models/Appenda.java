package com.greenfoxacademy.frontend.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Appenda {

    private String appendable;
    private String appended;

    public Appenda(String appendable) {
        this.appendable = appendable;
        this.appended = appendable + "a";
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }

    public String getAppendable() {
        return appendable;
    }

    public void setAppendable(String appendable) {
        this.appendable = appendable;
    }
}
