package exam.ticket1;

import java.util.ArrayList;
import java.util.List;

public class Ticket1 {
    public static <T> void alternate(List<T> list1, List<T> list2) {
        List<Object> helperList = new ArrayList<>();
        int i = 0;
        int j = 0;
        while( i  < list1.size() && j < list2.size()) {
            helperList.add(list1.get(i));
            i++;
            helperList.add(list2.get(j));
            j++;
        }
        for( var item : helperList) {
            System.out.print(item + " ");
        }
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        alternate(list1,list2);

    }
}
