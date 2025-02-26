package String_Example;
public class Hello {
    public static void main(String agrs[]){
        String str1="My State is Karnataka. All of we are in Karanataka";
        String str2="Hello planet earth, you are a grate planet";
        System.out.println(str1.indexOf("Karnataka"));
        System.out.println(str1.indexOf("Kaarnataka"));
        System.out.println(str2.indexOf("e"));
        System.out.println(str2.indexOf("a",5));
        System.out.println(str2.lastIndexOf("plant"));
        System.out.println(str2.lastIndexOf("planet"));
        System.out.println(str2.lastIndexOf("e",5));
        System.out.println(str2.lastIndexOf("a",5));
    }
}
