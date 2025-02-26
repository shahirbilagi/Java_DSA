package Placement_Example;

public class Sort012 {
    public static void sortArray(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } 
            else if (arr[mid] == 1) {
                mid++;
            } else {
                // arr[mid] == 2
                // Swap arr[mid] and arr[high]
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        sortArray(arr);
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
