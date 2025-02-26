package String_Example;
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("buffer=" + sb);
        System.out.println("length=" + sb.length());
        System.out.println("Capacity=" + sb.capacity());
        sb.setLength(3);
        System.out.println("buffer=" + sb);
        System.out.println("length=" + sb.length());
        System.out.println("Capacity=" + sb.capacity());
    }
}