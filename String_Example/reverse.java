package String_Example;
public class reverse {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("RIHAHS");
        sb.reverse();// If the index is beyound the limit it is exceptional case
        System.out.println(sb);
    }
}