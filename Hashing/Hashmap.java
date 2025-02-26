package Hashing;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Hashmap {
    public static void main(String agrs[]) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("China", 150);
        map.put("US", 100);
        System.out.println(map);
        map.put("US", 120);
        System.out.println(map);

        if (map.containsKey("China")) {
            System.out.println("Present");
        } else {
            System.out.println("Not present");
        }
        System.out.println(map.get("China"));
        System.out.println(map.size());
        // forloop
        int arr[] = { 12, 13, 14 };
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }
        map.remove("China");
        System.out.println(map);
    }
}
