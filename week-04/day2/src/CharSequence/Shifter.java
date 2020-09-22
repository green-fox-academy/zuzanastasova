package CharSequence;

public class Shifter implements CharSequence{

    String string;
    int shifted;

    public Shifter(String string, int shifted) {
        this.string = string;
        this.shifted = shifted;
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return string.charAt(index + shifted);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return string.subSequence(start + shifted, end + shifted);
    }
}
