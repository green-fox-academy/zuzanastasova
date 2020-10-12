import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class StreamAvgValue {
    public static void main(String[] args) throws IOException {

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        double average = numbers.stream().mapToInt(Integer::intValue)
                        .filter(number -> number % 2 != 0)
                        .average().orElseThrow(() -> new IOException("Something went wrong"));

        System.out.println(average);
    }
}
