package PractiseProblems;
import java.util.Scanner;
public class PG6 {
    public static void value(int sum){
        System.out.println("Sum value is: " + sum);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i <= n;i++) {
            sum = sum + i;
           
        }
        value(sum);
    }
}
