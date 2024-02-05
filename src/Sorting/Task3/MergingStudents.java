package Sorting.Task3;

import Sorting.GPAStudent;
import java.util.Arrays;

public class MergingStudents {
    public static void main(String[] args) {
        GPAStudent heisenberg = new GPAStudent("Walter Hartwell White", 56789, 4.0);
        GPAStudent jessie = new GPAStudent("Jesse Bruce Pinkman", 12345, 2.5);
        GPAStudent finger = new GPAStudent("Michael Ehrmantraut", 98765, 3.5);
        GPAStudent gus = new GPAStudent("Gustavo Fring", 24680, 3.8);
        GPAStudent saul = new GPAStudent("Saul Goodman", 13579, 3.0);
        GPAStudent hank = new GPAStudent("Henry Robert Schrader", 36912, 3.2);

        GPAStudent[] GPAList1 = new GPAStudent[]{heisenberg, jessie, finger};
        GPAStudent[] GPAList2 = new GPAStudent[]{gus, saul, hank};

        GPAStudent[] mergedAndSorted = mergeAndSort(GPAList1, GPAList2);

        for (GPAStudent student : mergedAndSorted) {
            System.out.println(student);
        }
    }

    public static GPAStudent[] mergeAndSort(GPAStudent[] list1, GPAStudent[] list2) {
        // Merge the two arrays into a single array
        GPAStudent[] mergedList = new GPAStudent[list1.length + list2.length];
        System.arraycopy(list1, 0, mergedList, 0, list1.length);
        System.arraycopy(list2, 0, mergedList, list1.length, list2.length);

        // Sort the merged array using merge sort
        return mergeSort(mergedList);
    }

    public static GPAStudent[] mergeSort(GPAStudent[] arr) {
        int length = arr.length;
        if (length <= 1) {
            return arr; // Base case: already sorted
        }

        // Split the array into two halves
        int mid = length / 2;
        GPAStudent[] left = Arrays.copyOfRange(arr, 0, mid);
        GPAStudent[] right = Arrays.copyOfRange(arr, mid, length);

        // Recursively sort each half
        left = mergeSort(left);
        right = mergeSort(right);

        // Merge the sorted halves
        return merge(left, right);
    }

    public static GPAStudent[] merge(GPAStudent[] left, GPAStudent[] right) {
        int totalLength = left.length + right.length;
        GPAStudent[] result = new GPAStudent[totalLength];

        int leftIndex = 0, rightIndex = 0, resultIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex].compareTo(right[rightIndex]) >= 0) {
                result[resultIndex++] = left[leftIndex++];
            } else {
                result[resultIndex++] = right[rightIndex++];
            }
        }

        // Copy remaining elements from left and right subarrays, if any
        while (leftIndex < left.length) {
            result[resultIndex++] = left[leftIndex++];
        }

        while (rightIndex < right.length) {
            result[resultIndex++] = right[rightIndex++];
        }

        return result;
    }
}
