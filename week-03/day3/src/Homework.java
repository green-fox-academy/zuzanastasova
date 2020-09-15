import java.util.*;

public class Homework {
    public static void main(String[] args) {

        HashMap <String, List<String>> trees = new HashMap<>();

        ArrayList <String> oak = new ArrayList <> ();
        oak.add("broadleaf tree");
        oak.add ("green");
        oak.add ("300");
        oak.add ("monoecious");
        trees.put ("oak", oak);

        ArrayList <String> cherry = new ArrayList <> ();
        cherry.add ("broadleaf tree");
        cherry.add ("green");
        cherry.add ("40");
        cherry.add ("female");
        trees.put ("cherry", cherry);

        ArrayList <String> apple = new ArrayList <> ();
        apple.add ("broadleaf tree");
        apple.add ("green");
        apple.add ("50");
        apple.add ("hermaphrodite");
        trees.put ("apple", apple);

        ArrayList <String> chestnut = new ArrayList <> ();
        chestnut.add ("broadleaf tree");
        chestnut.add ("green");
        chestnut.add ("100");
        chestnut.add ("hermaphrodite");
        trees.put ("chestnut", chestnut);

        ArrayList <String> ash = new ArrayList <> ();
        ash.add ("broadleaf tree");
        ash.add ("green");
        ash.add ("100");
        ash.add ("hermaphrodite");
        trees.put ("ash", ash);

        for (Map.Entry tree: trees.entrySet ()) {
            System.out.println(tree.getKey() + ": " + tree.getValue());
        }
    }
}
