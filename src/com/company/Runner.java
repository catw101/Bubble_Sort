package com.company;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        int[] something = Main.randInt(100);
        int[] copy1 = Arrays.copyOf(something, something.length);
        Main.bubbleSort(something);
        Main.print(something);
        Main.selectionSort(something);
        Main.print(something);
        Main.insertSort(something);
        Main.print(something);

        long time = System.currentTimeMillis();
        time = System.currentTimeMillis() - time;
        System.out.println("Insertion sort time took: " + time *.001 + "seconds.");
    }
}
