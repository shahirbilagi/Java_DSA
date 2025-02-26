package Sorting;

public class Merge {
    public static void conquer(int ar[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int id1 = si;
        int id2 = mid + 1;
        int x = 0;

        while (id1 <= mid && id2 <= ei) {
            if (ar[id1] <= ar[id2]) {
                merged[x++] = ar[id1++];
            } else {
                merged[x++] = ar[id2++];
            }
        }
        while (id1 <= mid) {
            merged[x++] = ar[id1++];
        }
        while (id2 <= ei) {
            merged[x++] = ar[id2++];
        }
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            ar[j] = merged[i];
        }

    }
    public static void divide(int ar[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(ar, si, mid);
        divide(ar, mid + 1, ei);
        conquer(ar, si, mid, ei);
    }

    public static void main(String args[]) {
        int ar[] = { 8, 6, 4, 3, 2, 5, 7 };
        int n = ar.length;
        divide(ar, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
