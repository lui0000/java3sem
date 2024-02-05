//package ticket6;
//import com.google.common.collect.HashMultiset;
//import com.google.common.collect.Multiset;
//import com.google.common.collect.Multisets;
//
//import java.util.Arrays;
//
//public class GuavaSortExample {
//
//    public static String[] guavaSort(String[] inputArray) {
//        // Создаем Multiset для подсчета вхождений строк
//        Multiset<String> multiset = HashMultiset.create(Arrays.asList(inputArray));
//
//        // Инициализируем массив для хранения отсортированных строк
//        String[] sortedArray = new String[inputArray.length];
//        int index = 0;
//
//        // Итерируем по отсортированному мультисету
//        for (String element : Multisets.copyHighestCountFirst(multiset)) {
//            // Повторяем каждую строку столько раз, сколько она встречается в мультисете
//            for (int i = 0; i < multiset.count(element); i++) {
//                sortedArray[index++] = element;
//            }
//        }
//
//        return sortedArray;
//    }
//
//    public static void main(String[] args) {
//        String[] inputArray = {"Farm", "Zoo", "Car", "Apple", "Bee", "Golf", "Bee", "Dog", "Golf", "Zoo", "Zoo", "Bee", "Bee", "Apple"};
//        String[] sortedArray = guavaSort(inputArray);
//
//        // Выводим отсортированный массив
//        System.out.println(Arrays.toString(sortedArray));
//    }
//}
