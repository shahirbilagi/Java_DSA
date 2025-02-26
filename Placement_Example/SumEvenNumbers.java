package Placement_Example;

public class SumEvenNumbers {

    public static int sumOfEvenNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 13, 14, 15, 6 };
        System.out.println("Sum of even numbers: " + sumOfEvenNumbers(arr));
    }
}