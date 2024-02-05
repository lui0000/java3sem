package SortExeption;

import java.lang.Comparable;
import java.util.Scanner;
import java.util.AbstractSet;

public class SortingStudentsByGPA {
    public static void studentSearch(GPAStudent[] studentArray) throws GPAExeption {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фамилию студента: ");
        String lastName = scanner.nextLine();

        boolean found = false; // Flag to check if the student is found

        for (final var item : studentArray) {
            if (item.getName().equals(lastName)) {
                System.out.println("Найден студент: " + item);
                found = true;
            }
        }

        if (!found) {
            throw new GPAExeption("Студент с фамилией '" + lastName + "' не найден.");
        }
    }
    public static void main(String[] args) throws GPAExeption {

        // Create an array of Student objects
        GPAStudent[] students = {
                new GPAStudent("John", 102, 3.0),
                new GPAStudent("Alice", 101, 3.2),
                new GPAStudent("Bob", 103, 3.8),
                new GPAStudent("Eve", 105, 2.5),
                new GPAStudent("Charlie", 104, 4.0)
        };
        try {
            studentSearch(students);
        } catch (GPAExeption e) {
            System.out.println("Студент с данной фамилией не найден");
        }

//        System.out.println("\nUnsorted Array:\n");
//        for (var student : students) {
//            System.out.println(student);
//        }
//        quickSort(students, 0, students.length - 1);
//
//        System.out.println("\nSorted Array by GPA:\n");
//        for (var student : students) {
//            System.out.println(student);
//        }
    }

    public static void quickSort(GPAStudent[] students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    public static int partition(GPAStudent[] students, int low, int high) {
        GPAStudent pivot = students[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (students[j].compareTo(pivot) <= 0) {
                i++;
                swap(students, i, j);
            }
        }

        swap(students, i + 1, high);
        return i + 1;
    }

    public static void swap(GPAStudent[] students, int i, int j) {
        GPAStudent temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }
}
// nlog(n)
