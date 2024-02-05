package exam.ticket3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Ticket3 {
    public static boolean isUnique(Map<String, String> map) {
        List<String> list = new ArrayList<>();
        for (var item : map.values()) {
            if (list.contains(item)) {
                return false;
            }
            list.add(item);
        }
        return true;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.computeIfAbsent("A", k -> "A");
        map.put("B", "B");
        map.put("C", "C");
        map.put("D", "A");
        System.out.println(isUnique(map));



    }
}
