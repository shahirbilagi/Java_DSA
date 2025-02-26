package Bits;

public class Set {
    public static void main(String agrs[]) {
        int number = 5; //0101
        int position = 1;
        int bitmask = 1 << position; //0100 & 0101
        int newNumber=bitmask | number;
        System.out.println(newNumber);
    }
}