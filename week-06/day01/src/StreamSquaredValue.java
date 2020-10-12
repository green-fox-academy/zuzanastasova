import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSquaredValue {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

        List<Integer> squaredNumbers = numbers.stream().filter(number -> number * number > 20)
                .collect(Collectors.toList());

        System.out.println(squaredNumbers);
    }
}
