package SortIDArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SortIDNumber {
    public static void main(String[] args) throws ParseException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(102, "Sonya", "23/03/2004"));
        students.add(new Student(101, "Alice", "07/03/2004"));
        students.add(new Student(103, "Bob", "16/11/2004"));
        students.add(new Student(105, "Eve", "05/12/1998"));
        students.add(new Student(104, "Charlie", "25/06/1998"));

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (Student student : students) {
            String dateString = student.getDate();
            try {
                Date date = dateFormat.parse(dateString);
                System.out.println("Parsed date for " + student.getName() + ": " + date);
            } catch (ParseException e) {
                System.out.println("Error: Invalid date format for " + student.getName());
            }
        }

        System.out.println("Unsorted List:");
        for (Student student : students) {
            System.out.println(student);
        }

        insertionSort(students);

        System.out.println("\nSorted List by iDNumber:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void insertionSort(List<Student> students) {
        int n = students.size();
        for (int i = 1; i < n; i++) {
            Student key = students.get(i);
            int j = i - 1;
            while (j >= 0 && key.compareTo(students.get(j)) < 0) {
                students.set(j + 1, students.get(j));
                j = j - 1;
            }
            students.set(j + 1, key);
        }
    }
}