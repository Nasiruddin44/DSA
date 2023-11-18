
/*
         #Hashing
         1:map - hashmap
               - Linked HashMap
               - Treemap
         2:Set - HashSet 
               - Linked Hashset
               - tREEsET
 

import java.util.HashMap;

public class Intro {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - o(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);
        // Get - 0(1)
        // int population = hm.get("India");
        // System.out.println(population);

        // System.out.println("Indonesia");

        // ContainsKey - 0(1)
        // System.out.println(hm.containsKey("India")); // true
        // System.out.println(hm.containsKey("Indonesia"));// false

        // Remove
        // System.out.println(hm.remove("China"));
        // System.out.println(hm);

        // size
        System.out.println(hm.size());

        // Is Empty
        hm.clear();
        System.out.println(hm.isEmpty());

    }
}
*/
import java.util.*;

public class Intro {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("India", 5);

        // Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("key=" + k + ",value=" + hm.get(k));
        }
    }
}