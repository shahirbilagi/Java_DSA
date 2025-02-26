package FunctionProblems;

import java.util.Scanner;

public class GreaterOf2 {

    public static void Greater(float a, float b) {
        if (a > b) {
            System.out.println(a + " is the Greatest Number");
        } else
            System.out.println(b + " is the greatest Number");

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Two numbers:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        Greater(a, b);

    }
}
