package StudentsByGPAArrayList;

public class StudentsByGPA implements Comparable<StudentsByGPA> {
    private final String Name;
    private final Integer ID;
    private final Double GPAScore;

    public StudentsByGPA(String Name, Integer ID, Double GPAScore) {
        this.Name = Name;
        this.ID = ID;
        this.GPAScore = GPAScore;
    }

    public String getName() {
        return Name;
    }

    public Integer getID() {
        return ID;
    }

    public Double getGPAScore() {
        return GPAScore;
    }

    @Override
    public String toString() {
        return "StudentsByGPA{" + "Name='" + Name + '\'' + ", ID=" + ID + ", GPAScore=" + GPAScore + '}';
    }

    @Override
    public int compareTo(StudentsByGPA otherStudent) {
        // Compare students based on their GPAScore
        return Double.compare(this.GPAScore, otherStudent.getGPAScore());
    }
}