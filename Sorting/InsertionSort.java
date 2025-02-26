package Sorting;

import java.util.Scanner;

public class InsertionSort {

    public static void printArr(int Arr[]) {
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Arr[] = { 9, 1, 2, 6, 3, 4, 5 };

        // bubble Sort
        for (int i = 1; i < Arr.length; i++) {
            int current = i;
            int j = i - 1;
            while (j >= 0 && current < Arr[j]) {
                Arr[j + 1] = Arr[j];
                j--;

            }
            Arr[j + 1] = current;
        }
        printArr(Arr);
    }

}
