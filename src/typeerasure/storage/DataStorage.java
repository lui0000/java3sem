package typeerasure.storage;

import java.lang.reflect.Array;

public class DataStorage {
    public static <A> A[] createArray(Class<A> elementType, int size) {
        // метод является частью Java Reflection API и
        // позволяет создавать массивы во время выполнения программы.
        return (A[]) Array.newInstance(elementType, size);
    }
    public static <A> A returnElementByIndex(A[] array, int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            System.out.println("No such element exists");
            return null;
        }
    }

    @SafeVarargs
    public static <A> void extractDirectory(A... elements) {
        for (A element : elements) {
            if (element != null) {
                String[] parts = element.toString().split("/");
                int length = parts.length;
                for (int j = 0; j < Math.min(5, length); j++) {
                    System.out.println(parts[j]);
                }
            } else {
                System.out.print("");
            }
        }
    }







    public static void main(String[] args) {
        Integer[] intArray = createArray(Integer.class, 5);
        String[] stringArray = createArray(String.class, 5);
        String[] stringArray1 = createArray(String.class, 5);

        extractDirectory("aaaaaaaaa/aaaaaaaaa/aaaaaaaaaaaa/a/a/aaa");

        extractDirectory(stringArray1);
        
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) Math.pow(i * 2, 3);
        }

        stringArray[0] = "You ask me ";
        stringArray[1] = " how I've been,";
        stringArray[2] = " well I'm good";
        stringArray[3] = ",";
        stringArray[4] = "I can't complain";

        for (Integer el : intArray) {
            System.out.print(el + "\t");
        }

        Integer intElement = returnElementByIndex(intArray, 0);
        System.out.println("\n intArray element by index 0: " + intElement);

        System.out.println();

        for (String el : stringArray) {
            System.out.print(el + "\t");
        }

        String stringElement = returnElementByIndex(stringArray, 0);
        System.out.println("\n stringArray element by index 0: " + stringElement);
    }

}
