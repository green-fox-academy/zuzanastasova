package postIt;

public class Main {

    public static void main(String[] args) {
        // write your code here
        PostIt idea1 = new PostIt("orange", "Idea 1", "blue");
        PostIt awesome = new PostIt();
        awesome.setBackgroundColor("pink");
        awesome.setText("Awesome");
        awesome.setTextColor("black");
        PostIt superb = new PostIt("yellow", "Superb!", "green");
        System.out.println(awesome.toString());
        System.out.println(idea1.getTextColor());
    }
}
