package Recursion;

public class CurentOccurence {
    public static int first = -1;
    public static int last = -1;

    public static void Curent(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr = str.charAt(idx);
        if (curr == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        Curent(str, idx + 1, element);
    }

    public static void main(String args[]) {
        String str = "shAhira";
        Curent(str, 0, 'a');
    }
}