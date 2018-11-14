package com.company;

public class Runner {

    public static void main(String[] args) {
	int[] runnerArray = {0, 6, 7, 1, 2, 3, 4, 5};
    Main.swap(runnerArray, 1, 2);
    Main.bubbleSort(runnerArray);
    Main.print(runnerArray);
    }
}
