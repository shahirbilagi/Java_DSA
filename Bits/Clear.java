package Bits;

public class Clear {
    
    public static void main(String agrs[]) {
        int number = 5; //0101
        int position = 2;
        int bitmask = 1 << position; //0100 & 0101
        int notbitmask=~(bitmask);
        int newNumber=notbitmask & number;
        System.out.println(newNumber);
    }
}
