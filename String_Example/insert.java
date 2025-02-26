package String_Example;

public class insert {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("I JAVA!");
        sb.insert(2, "Like ");// If the index is beyound the limit it is exceptional case
        System.out.println(sb);
    }
}