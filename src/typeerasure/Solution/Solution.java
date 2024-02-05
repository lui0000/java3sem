package typeerasure.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;

public class Solution<T, K, V> {
    private T t;
    private K k;
    private V v;

    public Solution(T t, K k, V v) {
        this.t = t;
        this.k = k;
        this.v = v;
    }

    @SafeVarargs
    public final ArrayList<T> newArrayList(T... elements) {
        return new ArrayList<>(Arrays.asList(elements));
    }

    @SafeVarargs
    // можно вызвать метод с любым кол-вом переменных или даже без них,
    // таким образом с элементами, вносимыми в метод можно работать как с массивом
    public final HashSet<T> newHashSet(T... elements) {
        return new HashSet<>(Arrays.asList(elements));
    }

    public HashMap<K, V> newHashMap(K[] keys, V[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("The number of keys and values must be the same.");
        }

        HashMap<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }

    public static void main(String[] args) {
        Solution<String, Integer, Double> solution = new Solution<>("Hello", 42, 3.14);

        ArrayList<String> stringList = solution.newArrayList("A", "B", "C");
        HashSet<String> integerSet = solution.newHashSet("first", "second", "first");
        Integer[] keys = {1, 2, 3};
        Double[] values = {1.1, 2.2, 3.3};
        HashMap<Integer, Double> map = solution.newHashMap(keys, values);

        System.out.println("String List: " + stringList);
        System.out.println("String HashSet: " + integerSet);
        System.out.println("HashMap: " + map);
    }
}
