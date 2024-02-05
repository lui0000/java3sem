package StudentSortArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        List<StudentsMerge> List1 = new ArrayList<>();
        List1.add(new StudentsMerge("Mark", 101));
        List1.add(new StudentsMerge("Sophia", 112));
        List1.add(new StudentsMerge("David", 211));
        List1.add(new StudentsMerge("Lily", 122));
        List1.add(new StudentsMerge("Oliver", 123));

        List<StudentsMerge> List2 = new ArrayList<>();
        List2.add(new StudentsMerge("John", 124));
        List2.add(new StudentsMerge("Alice", 133));
        List2.add(new StudentsMerge("Bob", 111));
        List2.add(new StudentsMerge("Eve", 143));
        List2.add(new StudentsMerge("Charlie", 132));

        List<StudentsMerge> mergedAndSorted = mergeAndSort(List1, List2);

        for (StudentsMerge student : mergedAndSorted) {
            System.out.println(student);
        }
    }

    public static List<StudentsMerge> mergeAndSort(List<StudentsMerge> list1, List<StudentsMerge> list2) {
        List<StudentsMerge> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        return mergeSort(mergedList);
    }

    public static List<StudentsMerge> mergeSort(List<StudentsMerge> arr) {
        int length = arr.size();
        if (length <= 1) {
            return arr; // Base case: already sorted
        }

        int mid = length / 2;
        List<StudentsMerge> left = arr.subList(0, mid);
        List<StudentsMerge> right = arr.subList(mid, length);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    public static List<StudentsMerge> merge(List<StudentsMerge> left, List<StudentsMerge> right) {
        int totalLength = left.size() + right.size();
        List<StudentsMerge> result = new ArrayList<>(totalLength);

        int leftIndex = 0, rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex).compareTo(right.get(rightIndex)) <= 0) {
                result.add(left.get(leftIndex));
                leftIndex++;
            } else {
                result.add(right.get(rightIndex));
                rightIndex++;
            }
        }

        result.addAll(left.subList(leftIndex, left.size()));
        result.addAll(right.subList(rightIndex, right.size()));

        return result;
    }
}