package PractiseProblems;
import java.util.Scanner;
public class PG1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int num2 = sc.nextInt();
        System.out.println("PRESS\n 1.Addition\n 2.Substraction\n 3.Multiplicatioon");
        System.out.println("Enter the Operation Number:");
        char op = sc.next().charAt(0);
        int result;
        switch (op) {
            case '1':
                result = num1 + num2;
                System.out.println("Addition of " + num1 + " and " + num2 + " is:" + result);
                break;
            case '2':
                result = num1 - num2;
                System.out.println("Substraction of" + num1 + "and" + num2 + "is" + result);
                break;
            case '3':
                System.out.println("Multiplcation of" + num1 + "and" + num2 + "is" + num1 * num2);
                break;

        }
    }
}
