package Arrays;

import java.util.Scanner;

public class Array2DSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 2D Array:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int shahir[][] = new int[row][col];
        System.out.println("Enter the Array value:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                shahir[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                System.out.print(+shahir[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println("Enter the value to be Searched:");
        int x = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (shahir[i][j] == x) {
                    System.out.println("Index found value in:"+"[" + i + ',' + j+"]");
                }
            }

        }
    }
}
