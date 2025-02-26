package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        Iterator<Integer> it=set.iterator();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        while(it.hasNext()){
            System.out.print(it.next());
        }
        System.out.println(set);
        if (!set.contains(6)) {
            System.out.println("Set contain 8");
        }
        set.remove(1);
        System.out.println(set);
        set.add(1);
        System.out.println(set);
        System.out.println(set.size());
       
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println(set.equals(set1));
    }
}
