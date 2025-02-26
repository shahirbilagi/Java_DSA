package Sorting;

import java.util.Scanner;

public class BubleSort {
    public static void printArr(int Arr[]) {
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Arr[] = { 9, 1, 2, 6, 3, 4, 5 };

        // bubble Sort
        for (int i = 0; i < Arr.length - 1; i++) {
            for (int j = 0; j < Arr.length - i - 1; j++) {
                if (Arr[j] > Arr[j + 1]) {
                    //Swap the array value
                    int temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                }

            }
        }
        printArr(Arr);
    }
}
