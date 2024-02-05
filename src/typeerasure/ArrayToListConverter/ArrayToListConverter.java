package typeerasure.ArrayToListConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListConverter {
    public static <T> List<T> convertArrayToList(T[] array) {
        // метод создает фиксированный список (List) из элементов массива array
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        // Пример конвертации массива строк в список
        String[] stringArray = {"one", "two", "three"};
        List<String> stringList = convertArrayToList(stringArray);
        System.out.println("List of Strings: " + stringList);

        // Пример конвертации массива чисел в список
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = convertArrayToList(intArray);
        System.out.println("List of Numbers: " + intList);
    }
}
