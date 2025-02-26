package FunctionProblems;

import java.util.Scanner;

public class AverageFunction {
    public static float Average(float a,float b,float c){
        float average=(a+b+c)/3;
        return average;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of three numbers:");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float average=Average(a,b,c);
System.out.println("The average of three number is:"+average);

    }
}
