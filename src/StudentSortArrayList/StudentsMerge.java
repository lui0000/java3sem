package StudentSortArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class StudentsMerge implements Comparable<StudentsMerge> {
    private final String Name;
    private final Integer IdNumber;

    public String getName() {
        return Name;
    }

    public int getIdNumber() {
        return IdNumber;
    }

    public StudentsMerge(String Name, int IdNumber) {
        this.Name = Name;
        this.IdNumber = IdNumber;
    }

    @Override
    public String toString() {
        return "StudentsMerge{" + "Name='" + Name + '\'' + ", IdNumber=" + IdNumber + '}';
    }

    public int compareTo(StudentsMerge other) {
        return this.IdNumber.compareTo(other.getIdNumber());
    }
}