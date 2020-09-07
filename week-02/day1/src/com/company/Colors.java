package com.company;

public class Colors {
    public static void main(String[] args) {
String [][] colors = {{"lime", "forest green", "olive", "pale green", "spring green"},
        {"orange red", "red", "tomato"},
        {"orchid", "violet", "pink", "hot pink"}
    };
        for (int row = 0; row < colors.length; row++) {
            for (int col = 0; col < colors[row].length; col++) {
                System.out.print(colors[row][col] + ", ");
            }
            System.out.println();
        }
    }
}
