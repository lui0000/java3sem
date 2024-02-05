package exam.ticket2;

import java.util.HashMap;
import java.util.Map;

public class Ticket2 {
    public static Map<String, Integer> reverse(Map<Integer, String> map) {
        Map<String, Integer> newMap = new HashMap<>();
        for (var key : map.keySet()) {
             newMap.put( map.get(key),key);
        }
        return newMap;

    }

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "meow");
        System.out.println(map);
        System.out.println( reverse(map));


    }
}
