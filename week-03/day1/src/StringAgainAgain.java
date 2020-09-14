public class StringAgainAgain {
    public static void main(String[] args) {
        System.out.println(strings("Hello World!"));
    }

    private static String strings(String string) {
        if (string.length()==0)
            return string;
        else
        {
            return string.charAt(0) + "*" + strings(string.substring(1));
        }
    }
    //Given a string, compute recursively a new string where all the adjacent chars are now separated by a *
}
