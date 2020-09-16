package sharpie;

public class Main {
    public static void main(String[] args) {

        Sharpie sharpieOne = new Sharpie();
        sharpieOne.color = "blue";
        sharpieOne.width = (float) 1.5990;
        sharpieOne.inkAmount = (float) 35.666;
        sharpieOne.use();

        System.out.println(sharpieOne.sharpieImage());
    }
}
