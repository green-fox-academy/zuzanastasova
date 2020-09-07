package com.company;

public class DiagonalMatrix {
    public static void main(String[] args) {
        int [] [] myArray = new int [4] [4];

        for (int row = 0; row < myArray.length; row++) {
            for (int i = 0; i < myArray.length; i++) {
                myArray[i][i] = 1; }
            for (int col = 0; col < myArray[row].length; col++) {
                System.out.print(myArray[row][col]);
            }
            System.out.println();
        }


        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        // - Print this two dimensional array to the output
    }
}
