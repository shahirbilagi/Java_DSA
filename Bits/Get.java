package Bits;
public class Get {
    public static void main(String agrs[]) {
        int number = 5; //0101
        int position = 3;
        int bitmask = 1 << position; //0100 & 0101
        if ((bitmask & number) == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("One");
        }
    }
}
