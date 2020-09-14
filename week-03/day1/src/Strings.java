public class Strings {

    public static void main(String[] args) {
        System.out.println(strings("Hello, whx are xou here?"));
    }

    public static String strings (String string){
        if (string.length() == 0)
            return string;
        else if (string.charAt(0) == 'x') {
            string = 'y' + string.substring(1);
        }
        return string.charAt(0) + strings (string.substring(1));
    }
        //Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
}
