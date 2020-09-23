package Printable;

import java.util.List;

public class Todo implements Printable {

    String task;
    String priority;
    boolean isDone;

    public Todo () {

    }

    @Override
    public void printAllFields() {
        System.out.println("Task: " + task + " | Priority: " + priority + " | Done: " + isDone);
    }
}
