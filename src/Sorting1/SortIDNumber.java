package Sorting1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SortIDNumber {
    public static void main(String[] args) throws ParseException {
        // Create an array of Student objects
        Student[] students = {
                new Student(102, "Sonya", "23/03/2004"),
                new Student(101, "Alice","07/03/2004"),
                new Student(103, "Bob","16/11/2004"),
                new Student(105, "Eve","05/12/1998"),
                new Student(104, "Charlie","25/06/1998")
        };
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (Student value : students) {
            String dateString = value.getDate();
            try {
                // Parse the string to a Date object
                Date date = dateFormat.parse(dateString);

                // Output the parsed date
                System.out.println("Parsed date for " + value.getName() + ": " + date);
            } catch (ParseException e) {
                System.out.println("Error: Invalid date format for " + value.getName());
            }
        }

        System.out.println("Unsorted Array:");
        for (var student : students) {
            System.out.println(student);
        }

        // Sort the students array using insertion sort
        insertionSort(students);

        // Display the sorted array
        System.out.println("\nSorted Array by iDNumber:");
        for (var student : students) {
            System.out.println(student);
        }
    }

    // Insertion sort method for sorting Student objects based on iDNumber
    public static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
           Student key = students[i];
            int j = i - 1;
            while (j >= 0 && key.compareTo((Student) students[j]) < 0) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }
}
//сложность в хучшему случае n^2
// в среднем случае n