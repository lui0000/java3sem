package Sorting;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    private String[] fullLegalName;
    private Integer ID;

    public Student(String fullLegalName, Integer ID) {
        this.fullLegalName = fullLegalName.split(" ");
        this.ID = ID;
    }

    public String[] getFullLegalName() {
        return fullLegalName;
    }
    public void setFullLegalName(String name) {
        this.fullLegalName = name.split(" ");
    }
    public void setFirstName(String firstName) {
        fullLegalName[0] = firstName;
    }
    public void setSurname(String surname) {
        fullLegalName[1] = surname;
    }

    public Integer getID() {
        return ID;
    }
    public void setID(Integer ID) {
        this.ID = ID;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name=" + Arrays.toString(fullLegalName) +
                ", ID=" + ID +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.ID.compareTo(other.getID());
    }

}
