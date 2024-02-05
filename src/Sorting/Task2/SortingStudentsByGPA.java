package Sorting.Task2;

import Sorting.GPAStudent;

public class SortingStudentsByGPA {
    public static void main(String[] args) {
        GPAStudent heisenberg = new GPAStudent("Walter White", 56789, 4.0);
        GPAStudent jessie = new GPAStudent("Jesse Pinkman", 12345, 2.5);
        GPAStudent finger = new GPAStudent("Michael Ehrmantraut", 98765, 3.5);
        GPAStudent gus = new GPAStudent("Gustavo Fring", 24680, 3.8);
        GPAStudent saul = new GPAStudent("Saul Goodman", 13579, 3.0);
        GPAStudent hank = new GPAStudent("Henry Schrader", 36912, 3.2);

        GPAStudent[] GPAList = new GPAStudent[]{heisenberg, jessie, finger, gus, saul, hank};

        quickSort(GPAList, 0, GPAList.length - 1);

        for (var student : GPAList) {
            System.out.println(student);
        }
    }

    public static void quickSort(GPAStudent[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static int partition(GPAStudent[] arr, int low, int high) {
        double pivot = arr[high].getGPAScore(); // Choosing the last element as the pivot
        int i = low - 1;

        for (int j = low; j < high; ++j) {
            if (arr[j].getGPAScore() > pivot) {
                ++i;
                // Swap arr[i] and arr[j] directly
                var temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        var temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}