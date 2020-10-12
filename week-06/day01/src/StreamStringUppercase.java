
public class StreamStringUppercase {

    public static void main(String[] args) {

        String string = "HeLlo, How aRe yoU?";

        string.chars()
                .filter(Character::isUpperCase)
                .mapToObj(Character::toString)
                .map(c -> c + " ")
                .forEach(System.out::print);
    }
}
