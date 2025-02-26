package OOPs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class List {
    public static void main(String args[]) {
        ArrayList<Integer> List = new ArrayList<Integer>();
        List.add(0);
        List.add(1);
        List.add(2);
        System.out.println(List);

        int element = List.get(0);
        System.out.println(element);

        List.add(1, 1);
        System.out.println(List);

        List.set(0, 5);
        System.out.println(List);

        List.remove(3);
        System.out.println(List);

        int size = List.size();
        System.out.println(size);

        for (int i = 0; i < List.size(); i++) {
            System.out.print(List.get(i));
        }

        Collections.sort(List);
        System.out.println(List);
    }
}
