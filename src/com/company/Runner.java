package com.company;

public class Runner {

    public static void main(String[] args) {
        int[] something = Main.randInt(100);
        Main.bubbleSort(something);
        Main.print(something);
        Main.selectionSort(something);
        Main.print(something);
        Main.insertSort(something);
        Main.print(something);
    }
}
