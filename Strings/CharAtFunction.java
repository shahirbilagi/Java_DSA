package Strings;

public class CharAtFunction {
    public static void main(String args[]) {
        String fname = "Shahir";
        String lname = "Bilagi";
        String result = fname + lname;
        System.out.println(result);
        for (int i = 0; i < result.length(); i++) {
            System.out.println(result.charAt(i));
        }

    }
}

