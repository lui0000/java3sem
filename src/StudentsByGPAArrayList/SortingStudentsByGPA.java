package StudentsByGPAArrayList;

import java.util.ArrayList;
import java.util.List;

public class SortingStudentsByGPA {
    public static void main(String[] args) {
        List<StudentsByGPA> students = new ArrayList<>();
        students.add(new StudentsByGPA("John", 102, 3.0));
        students.add(new StudentsByGPA("Alice", 101, 3.2));
        students.add(new StudentsByGPA("Bob", 103, 3.8));
        students.add(new StudentsByGPA("Eve", 105, 2.5));
        students.add(new StudentsByGPA("Charlie", 104, 4.0));

        System.out.println("\nUnsorted List:\n");
        for (var student : students) {
            System.out.println(student);
        }

        quickSort(students, 0, students.size() - 1);

        System.out.println("\nSorted List by GPA:\n");
        for (var student : students) {
            System.out.println(student);
        }
    }

    public static void quickSort(List<StudentsByGPA> students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    public static int partition(List<StudentsByGPA> students, int low, int high) {
        StudentsByGPA pivot = students.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (students.get(j).compareTo(pivot) <= 0) {
                i++;
                swap(students, i, j);
            }
        }

        swap(students, i + 1, high);
        return i + 1;
    }

    public static void swap(List<StudentsByGPA> students, int i, int j) {
        StudentsByGPA temp = students.get(i);
        students.set(i, students.get(j));
        students.set(j, temp);
    }
}