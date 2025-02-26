package Recursion;

public class TOH {
    public static void Towerofhanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transffered disk " + n + " from " + src + " to " + dest);
            return;
        }
        Towerofhanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        Towerofhanoi(n - 1, helper, src, dest);
        return;

    }

    public static void main(String args[]) {
        int n = 3;
        Towerofhanoi(n, "Source", "Helper", "Destination");

    }
}
