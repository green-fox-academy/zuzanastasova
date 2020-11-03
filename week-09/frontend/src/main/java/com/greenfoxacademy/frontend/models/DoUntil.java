package com.greenfoxacademy.frontend.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DoUntil {

    private Integer until;
    private Integer result;

    public void calculate(String action){
        if (action.equalsIgnoreCase("sum")){
            result = sum(until);
            until = null;
        } else if(action.equalsIgnoreCase("factor")){
            result = factorial(until);
            until = null;
        }
    }

    private int sum(int until){
        int sum = 0;
        for (int i = 1; i <= until; i++) {
            sum += i;
        }
        return sum;
    }

    private int factorial(int until){
        int sum = 1;
        for (int i = 1; i <= until; i++) {
            sum = sum * i;
        }
        return sum;
    }

    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
