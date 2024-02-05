package StudentsMerge;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        // Create two arrays of Student objects
        StudentsMerge[] List1 = {
                new StudentsMerge("Mark", 101),
                new StudentsMerge("Sophia", 112),
                new StudentsMerge("David", 211),
                new StudentsMerge("Lily", 122),
                new StudentsMerge("Oliver", 123)
        };

        StudentsMerge[] List2 = {
                new StudentsMerge("John", 124),
                new StudentsMerge("Alice", 133),
                new StudentsMerge("Bob", 111),
                new StudentsMerge("Eve", 143),
                new StudentsMerge("Charlie", 132)
        };

        StudentsMerge[] mergedAndSorted = mergeAndSort(List1, List2);

        for (StudentsMerge student : mergedAndSorted) {
            System.out.println(student);
        }
    }

    public static StudentsMerge[] mergeAndSort(StudentsMerge[] list1, StudentsMerge[] list2) {
        // Merge the two arrays into a single array
        StudentsMerge[] mergedList = new StudentsMerge[list1.length + list2.length];
        System.arraycopy(list1, 0, mergedList, 0, list1.length);
        System.arraycopy(list2, 0, mergedList, list1.length, list2.length);

        // Sort the merged array using merge sort
        return mergeSort(mergedList);
    }

    public static StudentsMerge[] mergeSort(StudentsMerge[] arr) {
        int length = arr.length;
        if (length <= 1) {
            return arr; // Base case: already sorted
        }

        // Split the array into two halves
        int mid = length / 2;
        StudentsMerge[] left = Arrays.copyOfRange(arr, 0, mid);
        StudentsMerge[] right = Arrays.copyOfRange(arr, mid, length);

        // Recursively sort each half
        left = mergeSort(left);
        right = mergeSort(right);

        // Merge the sorted halves
        return merge(left, right);
    }

    public static StudentsMerge[] merge(StudentsMerge[] left, StudentsMerge[] right) {
        int totalLength = left.length + right.length;
        StudentsMerge[] result = new StudentsMerge[totalLength];

        int leftIndex = 0, rightIndex = 0, resultIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex].compareTo(right[rightIndex]) <= 0) {
                result[resultIndex++] = left[leftIndex++];
            } else {
                result[resultIndex++] = right[rightIndex++];
            }
        }

        // Copy remaining elements from left and right subarrays
        while (leftIndex < left.length) {
            result[resultIndex++] = left[leftIndex++];
        }

        while (rightIndex < right.length) {
            result[resultIndex++] = right[rightIndex++];
        }

        return result;
    }
}
// n log(n)