package com.company;

public class DoubleItems {
    public static void main(String[] args) {
       int [] numList = {3, 4, 5, 6, 7};
        for (int num = 0; num < numList.length; num++) {
            numList[num] = numList [num] * 2;
            System.out.println(numList[num]);
        }
// - Double all the values in the array
    }
}
