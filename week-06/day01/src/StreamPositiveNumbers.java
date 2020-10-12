import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPositiveNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        List<Integer> positiveNumbers = numbers.stream().filter(number -> number >= 0)
                .collect(Collectors.toList());

        System.out.println(positiveNumbers);
    }

}
