package sharpie;

public class Main {
    public static void main(String[] args) {

        Sharpie sharpieOne = new Sharpie();
        sharpieOne.setColor("green");
        sharpieOne.setWidth(1.5990f);
        sharpieOne.setInkAmount (35.666f);
        sharpieOne.use();

        System.out.println(sharpieOne.toString());
    }
}
