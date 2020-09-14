public class Power {
    public static void main(String[] args) {
        System.out.println(powerRec(5,3));
    }
    public static int powerRec (int n, int p){
        int result = 0;
        if (p != 0)
        result = n * powerRec(n ,p - 1);
        else
            return 1;
        return result;
    }

    //Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
}
