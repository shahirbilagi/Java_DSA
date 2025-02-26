package FunctionProblems;
import java.util.Scanner;
public class FactorialFunction {
    
    public static void factorial(int n){
        if(n<0){
            System.out.println("Invalid");
            return;
        }
        int fact=1;
            for(int i=n;i>=1;i--){
                fact=fact*i;
            }
            System.out.println("Factorail of the Number is:"+fact);
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        factorial(n);
    }
}
