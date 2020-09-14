public class StringsAgain {
    public static void main(String[] args) {
        System.out.println(strings("Hello, whx are xou here?"));
    }

    public static String strings (String string) {
        if (string.length() == 0)
            return string;
        else if (string.charAt(0) == 'x') {
            string = string.substring(0, 0) + string.substring(1);
        }
        return  string.charAt(0) + strings(string.substring(1)) ;
    }

    //Given a string, compute recursively a new string where all the 'x' chars have been removed.
}
