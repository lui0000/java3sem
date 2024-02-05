package StudentsByGPA;

public class SortingStudentsByGPA {
    public static void main(String[] args) {
        // Create an array of Student objects
        StudentsByGPA[] students = {
                new StudentsByGPA("John", 102, 3.0),
                new StudentsByGPA("Alice", 101, 3.2),
                new StudentsByGPA("Bob", 103, 3.8),
                new StudentsByGPA("Eve", 105, 2.5),
                new StudentsByGPA("Charlie", 104, 4.0)
        };
        System.out.println("\nUnsorted Array:\n");
        for (var student : students) {
            System.out.println(student);
        }
        quickSort(students, 0, students.length - 1);

        System.out.println("\nSorted Array by GPA:\n");
        for (var student : students) {
            System.out.println(student);
        }
    }

    public static void quickSort(StudentsByGPA[] students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    public static int partition(StudentsByGPA[] students, int low, int high) {
        StudentsByGPA pivot = students[high];
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

    public static void swap(StudentsByGPA[] students, int i, int j) {
        StudentsByGPA temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }
}
// nlog(n)