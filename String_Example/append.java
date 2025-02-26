package String_Example;

public class append {
    public static void main(String agrs[]){
        String s;
        int a=42;
        StringBuilder sb=new StringBuilder(50);
        s=sb.append("a=").append(a).append("!").toString();
        System.out.println(s);
        System.out.println(sb.capacity());
    }
}
