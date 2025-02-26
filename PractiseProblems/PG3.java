package PractiseProblems;

import java.util.Scanner;

public class PG3 {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the third Number:");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("Greatest:" + num1);
        }
        if (num1 < num2 && num3 < num2)
            System.out.println("Greatest:" + num2);
        else {
            System.out.println("Greatest:" + num3);
        }
    }
}
