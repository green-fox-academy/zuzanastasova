public class Bunnies {
    public static void main(String[] args) {
        System.out.println(bunniesEars(4));
    }
    public static int bunniesEars (int bunny){
        int result = 0;
        if (bunny == 0)
            return 0;
        else
           result = 2 + bunniesEars(bunny - 1);
        return result;

    }
    //We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
}
