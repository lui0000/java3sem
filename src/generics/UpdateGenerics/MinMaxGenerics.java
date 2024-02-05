package generics.UpdateGenerics;

public class MinMaxGenerics<T extends Comparable<T>> {
    private final T[] array;

    public MinMaxGenerics(T[] array) {
        this.array = array;
    }
    public T FindMin() {
        if(array == null || array.length == 0) {
            throw new  IllegalArgumentException("Array is empty or null.");
        }
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }
    public T FindMax() {
        if(array == null || array.length == 0) {
            throw new  IllegalArgumentException("Array is empty or null.");
        }
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {4, 2, 7, 1, 9, 5};
        MinMaxGenerics<Integer> integerMinMaxGenerics = new MinMaxGenerics<>(intArray);
        System.out.println("Minimum: " + integerMinMaxGenerics.FindMin());
        System.out.println("Maximum: " + integerMinMaxGenerics.FindMax());

        String[] stringsArray = {"Tom", "Al", "q"};
        MinMaxGenerics<String> stringMinMaxGenerics = new MinMaxGenerics<>(stringsArray);
        System.out.println("Minimum: " + stringMinMaxGenerics.FindMin());
        System.out.println("Maximum: " + stringMinMaxGenerics.FindMax());
    }

}
