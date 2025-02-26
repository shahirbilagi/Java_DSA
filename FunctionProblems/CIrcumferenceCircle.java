package FunctionProblems;

import java.util.Scanner;

public class CIrcumferenceCircle {
    public static Double Radius(float radius) {
        return 2 * 3.14 * radius;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle:");
        float radius = sc.nextFloat();
        System.out.println("Circumference of Circle is " + Radius(radius));
    }

}
