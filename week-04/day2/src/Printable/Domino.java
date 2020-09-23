package Printable;

public class Domino implements Printable {

    int leftSide;
    int rightSide;

    @Override
    public void printAllFields() {
        System.out.println("Domino A side: " + leftSide + ", B side: " + rightSide);
    }
}
