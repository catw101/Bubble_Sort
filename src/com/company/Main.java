package com.company;

public class Main {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[i]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }
    public int[] randInt(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10000);
        }
        return arr;
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[i] < arr[j])
                    break;
                else {

                }
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