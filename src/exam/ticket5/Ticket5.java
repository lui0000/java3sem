package exam.ticket5;

import java.util.*;

public class Ticket5 {
//    public static void rarest(Map<String, Integer> map) {
//        List<Integer> list = new ArrayList<>(map.values());
//        Map<Integer, String> treemap = new TreeMap<>();
//        for (var item : map.keySet()) {
//            int itemFrequency = count(list,map.get(item));
//            treemap.put(itemFrequency, item);
//        }
//        for (var item : treemap.keySet()) {
//            System.out.println(item + " " + treemap.get(item));
//        }
//    }
//    private static int count(List<Integer> list, int target) {
//        int counter = 0;
//        for (var item : list)
//            if (item == target)
//                ++counter;
//        return counter;
//    }
//
//    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("String1", 1);
//        map.put("String2", 2);
//        map.put("String3", 3);
//        map.put("String4", 4);
//        map.put("String5", 5);
//        map.put("String6", 6);
//        map.put("String7", 3);
//        map.put("String8", 4);
//        map.put("String9", 3);
//        map.put("String10", 4);
//        rarest(map);
//    }
    //надо будет переделать

    // вспомогательный метод возвращающий минимальное количество вхождений

    private static int rerestHelper(Map<Integer, Integer> countMap) {
        int countMin = Integer.MAX_VALUE;
        int rerestAge = 0;
        for (Map.Entry<Integer,Integer> entry: countMap.entrySet()) {
            int value = entry.getValue();
            int key = entry.getKey();
            if(value < countMin) {
                countMin = value;
                rerestAge = key;
            }
        }
        return rerestAge;
    }

    //метод составляющий словарь частотности
    public static int rarest(Map<String, Integer> ages) throws Exception {
        if (ages.isEmpty()) {
            throw new Exception("map is entry");
        }
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(var age : ages.values()) {
            frequencyMap.put(age, frequencyMap.getOrDefault(age,0) + 1);
        }
        return rerestHelper(frequencyMap);
    }

    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alyssa", 22);
        ages.put("Char", 25);
        ages.put("Dan", 25);
        ages.put("Jeff", 20);
        ages.put("Kasey", 20);
        ages.put("Kim", 20);
        ages.put("Mogran", 25);
        ages.put("Ryan", 25);
        ages.put("Stef", 22);

        try {
            int rarestAge = rarest(ages);
            System.out.println("Наименьшее часто встречающееся значение: " + rarestAge);
        } catch (Exception e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }
}
