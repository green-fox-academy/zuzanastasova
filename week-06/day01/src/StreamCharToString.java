import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamCharToString {

    public static void main(String[] args) {

        List<Character> chars = Arrays.asList('a','c','a','b');

        String string = chars.stream().map(Objects::toString).collect(Collectors.joining());

        System.out.println(string);
    }
}
