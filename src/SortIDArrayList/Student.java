package SortIDArrayList;

public class Student implements Comparable<Student> {
    private final int iDNumber;
    private final String Name;
    private final String data;

    public int getiDNumber() {
        return iDNumber;
    }

    public String getName() {
        return Name;
    }

    public Student(int iDNumber, String Name, String data) {
        this.data = data;
        this.iDNumber = iDNumber;
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", Name='" + Name + '\'' +
                ", Data='" + data + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.iDNumber, otherStudent.getiDNumber());
    }

    public String getDate() {
        return data;
    }
}