package exam.ticket4;

import java.util.HashSet;
import java.util.Set;

public class Ticket4 {
    public static boolean hasOdd(Set<Integer> set) {
        if (set.isEmpty()) {
            return false;
        } else {
            for (var item: set) {
                if (item%2 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < 10; i += 2) {
            set.add(i);
        }
        System.out.println(hasOdd(set));
    }
}
