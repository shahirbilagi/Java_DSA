package LinkedList;
import java.util.LinkedList;
import java.util.*;
class LL1 {
    public static void main(String args[]){
        LinkedList<Integer> list =new LinkedList<Integer>();
        list.addFirst(1);
        System.out.println(list);
        list.addLast(2);
        list.addLast(3);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){

            System.out.println(list.get(i));
        }
        
    }
}
