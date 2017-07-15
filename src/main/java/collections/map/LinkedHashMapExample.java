package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Hello", "");
        hashMap.put("Antracn", "");
        hashMap.put("Kaleo", "");

        System.out.println(hashMap);

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Hello", "");
        linkedHashMap.put("Antracn", "");
        linkedHashMap.put("Kaleo", "");

        System.out.println(linkedHashMap);

    }
}
