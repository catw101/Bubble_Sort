package com.company;

public class Main {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr) {
        int swaps = 1;
         while (swaps!=0) {
             swaps = 0;
             for (int i = 0; i < arr.length-1; i++) {
                 if (arr[i] > arr[i+1]) {
                     swap(arr, i, i+1);
                     swaps++;
                 }
             }
         }
    }
    public static int[] randInt(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10000);
        }
        return arr;
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    swap(arr, i, j);
            }
        }
    }

    public static void print(int[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str = str + arr[i] + " ";
        }
        System.out.println(str);
    }
}