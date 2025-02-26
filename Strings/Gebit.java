package Strings;

public class Gebit {
    
    public static void main(String agrs[]) {
        int number = 10;
        int position = 3;
        int bitmask = 1 << position;
        if ((bitmask & number) == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("One");
        }
    }
}
