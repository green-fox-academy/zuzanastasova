package Printable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Domino> dominoes = new ArrayList<Domino>();
        List<Todo> todos = new ArrayList<Todo>();

        Domino domino = new Domino();
        domino.leftSide = 3;
        domino.rightSide = 2;
        dominoes.add(domino);

        Todo todo = new Todo();
        todo.task = "Buy milk";
        todo.priority = "high";
        todo.isDone = true;
        todos.add(todo);

        for (Domino d : dominoes) {
            d.printAllFields();
        }

        for (Todo t : todos) {
            t.printAllFields();
        }
    }
}
