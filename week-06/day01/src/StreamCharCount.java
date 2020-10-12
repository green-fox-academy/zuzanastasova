import java.util.Map;
import java.util.stream.Collectors;

public class StreamCharCount {

    public static void main(String[] args) {
        //Write a Stream Expression to find the frequency of characters in a given string!
        String string = "hello, how are you?";

       Map<Character, Long> occurrence = string.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(o -> o, Collectors.counting()));

       System.out.println(occurrence);
    }
}
