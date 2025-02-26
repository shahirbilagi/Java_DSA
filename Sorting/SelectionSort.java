package Sorting;

import java.util.Scanner;

public class SelectionSort {
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
            int smallest = i;
            for (int j = i + 1; j < Arr.length; j++) {
                if (Arr[smallest] > Arr[j]) {
                    smallest = j;
                }
            }
            // Swap the array value
            int temp = Arr[smallest];
            Arr[smallest] = Arr[i];
            Arr[i] = temp;

        }
        printArr(Arr);
    }

}
