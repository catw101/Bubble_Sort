package com.company;

public class Runner {

    public static void main(String[] args) {
        int[] something = Main.randInt(100);
        Main.swap(something, 1, 2);
        Main.print(something);
        Main.bubbleSort(something);
        Main.print(something);
    }
}
