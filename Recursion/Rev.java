package Recursion;

public class Rev {
    public static void Revv(String str,int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        Revv(str,idx-1);

    }
    public static void main(String agrs[]){
        String str="abcd";
        Revv(str,str.length()-1);
    }
}
