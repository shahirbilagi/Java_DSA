package PractiseProblems;

import java.util.Scanner;

public class PG5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(+a+" is even Number");
        } else {
            System.out.println(+a+" is odd number");
        }
    }
}
