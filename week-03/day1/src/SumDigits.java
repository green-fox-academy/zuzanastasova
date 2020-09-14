public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigitsRec(1266));
    }
    public static int sumDigitsRec (int n) {
        int result = 0;
        int length = String.valueOf(n).length();
        if (n == 0);
        else
            result =  n % 10 + sumDigitsRec(n/10) ;
        return result;
    }


    //*Sum Digits
    //Given a non-negative integer n, return the sum of its digits recursively (without loops).
    //
    //Hint
    //Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
    //Java, C++, C#, Python
    //Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).
    //JavaScript, TypeScript
    //There is no integer type in JavaScript. To remove the rightmost digit you must divide (/) the number by 10 and find a way to get the the whole number portion of that number.*//
}
