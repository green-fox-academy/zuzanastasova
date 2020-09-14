public class NumberAdder {
    public static void main(String[] args) {
        System.out.println(sumRecursive(4));
    }

    public static int sumRecursive(int n) {
        int result = 0;
        if (n == 0);
        else
            result = n + sumRecursive (n - 1);
        return result;
    }
    //Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
}
