package app;

import java.util.HashMap;
import java.util.Hashtable;

public class Hashmaps {
    public static void start() {
        // it is a implementation of the "Map" interface
        HashMap<String, Integer> employees = new HashMap<>();

        // put adds or updates, depending on if the key already exists
        employees.put("Churros", 7);
        employees.put("Shoyou", 8);
        
        // replace only replaces the value of existing keys. It does not do anything the key does not exists
        employees.replace("Shoyou", 4);

        // only adds the pair if not already exists
        employees.putIfAbsent("Churros", 10);
        employees.putIfAbsent("Gui", 19);
        
        System.out.println(employees.get("Churros"));
        System.out.println(employees.get("Shoyou"));
        System.out.println(employees.containsKey("Churros"));
        System.out.println(employees.containsKey("Churross"));
        System.out.println(employees.containsValue(7));
        System.out.println(employees.containsValue(8));
        System.out.println(employees.containsValue(0));
        System.out.println(employees);

        employees.remove("Gui");
        System.out.println(employees);
    }
}
