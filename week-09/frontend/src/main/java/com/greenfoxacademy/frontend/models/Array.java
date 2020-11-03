package com.greenfoxacademy.frontend.models;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array {

    private String what;
    private int[] numbers;
    private Object result;

    public void sum(){
            result = Arrays.stream(numbers).sum();
    }

    public void multiply(){
            result = IntStream.of(numbers).reduce(1, (x, y) -> x * y);
    }

    public void doubled(){
        result = Arrays.stream(numbers).map(x -> x * 2).toArray();
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
