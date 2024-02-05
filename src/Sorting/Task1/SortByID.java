package Sorting.Task1;

import Sorting.Student;

public class SortByID {
    public static void main(String[] args) {
        Student heisenberg = new Student("Walter White", 56789);
        Student jessie = new Student("Jesse Pinkman", 12345);
        Student finger = new Student("Michael Ehrmantraut", 98765);
        Student gus = new Student("Gustavo Fring", 24680);
        Student saul = new Student("Saul Goodman", 13579);
        Student hank = new Student("Henry Schrader", 36912);

        Student[] IDNumber = new Student[]{heisenberg, jessie, finger, gus, saul, hank};

        int size = IDNumber.length;
        for (int i = 0; i < size - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < size; ++j) {
                if (IDNumber[j].compareTo(IDNumber[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            Student temp = IDNumber[i];
            IDNumber[i] = IDNumber[minIndex];
            IDNumber[minIndex] = temp;
        }

        for (var item : IDNumber) {
            System.out.println(item);
        }
    }
}