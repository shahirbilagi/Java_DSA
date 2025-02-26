package Strings;

public class ReverseString {
    public static void main(String args[]) {
        StringBuilder shahir = new StringBuilder("Hello");
        for (int i = 0; i < shahir.length() / 2; i++) {
            int front = i;
            int back = shahir.length() - 1 - i;

            char frontchar = shahir.charAt(front);
            char backchar = shahir.charAt(back);

            shahir.setCharAt(front, backchar);
            shahir.setCharAt(back, frontchar);

        }
        System.out.println(shahir);
    }
}
