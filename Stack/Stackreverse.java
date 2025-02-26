package Stack;
import java.util.Stack;
public class Stackreverse {
    public static void PushButtom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        PushButtom(data, s);
        s.push(top);
    }
    public static void Reverse( Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        Reverse(s);
        PushButtom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        Reverse(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

