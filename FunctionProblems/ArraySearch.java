package FunctionProblems;
import java.util.Scanner;
public class ArraySearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        int shahir[] = new int[n];
        System.out.println("Enter the Array value:");
        for (int i = 0; i < shahir.length; i++) {
            shahir[i] = sc.nextInt();

        }
        System.out.println("Enter the value to be Searched:");
        int x = sc.nextInt();
        for (int i = 0; i < shahir.length; i++) {
            if (shahir[i] == x) {
                System.out.println("Index found value in:" + i);
            }
        }

    }
}
