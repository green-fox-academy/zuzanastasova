package com.company;

public class SwapElements {
    public static void main(String[] args) {
        String [] orders = {"first", "second", "third"};
        String tmp = orders [0];
        orders [0] = orders [2];
        orders [2] = tmp;

        for (int i = 0; i < orders.length; i++) {
            System.out.println(orders[i]);
        }

// - Swap the first and the third element of `orders`
    }
}
