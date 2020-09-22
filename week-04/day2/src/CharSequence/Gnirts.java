package CharSequence;

public class Gnirts implements CharSequence{

    String string;

    public Gnirts(String string) {
        this.string = string;
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return string.charAt(string.length()-1-index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String reverse = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reverse += string.charAt(i);
        }
        return reverse.subSequence(start, end);
    }
}
