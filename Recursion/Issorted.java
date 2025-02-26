package Recursion;

public class Issorted {
    public static boolean sorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] >= arr[idx + 1]) {
            return false;
        }
        return sorted(arr, idx + 1);
    }

    public static void main(String agrs[]) {
        int arr[] = { 1, 2, 4, 3 };
        System.out.println(sorted(arr, 0));
    }
}
