package Recursion;

public class NaturalNumber {
    public static void print(int i,int n,int sum) {
        if (i == n) {
            sum+=i;
            System.out.println(sum);
            return;
        }
       sum+=i;
       print(i+1, n, sum);

    }

    public static void main(String args[]) {
        int i=1,n=5,sum=0;
        print(i,n,sum);
    }
}
