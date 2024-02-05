package Sorting;

import java.util.Arrays;

public class GPAStudent implements Comparable<GPAStudent> {
    private String[] fullLegalName;
    private Integer ID;
    private Double GPAScore;

    public GPAStudent(String fullLegalName, Integer ID, Double GPAScore) {
        this.fullLegalName = fullLegalName.split(" ");
        this.ID = ID;
        this.GPAScore = GPAScore;
    }

    public String[] getFullLegalName() {
        return fullLegalName;
    }
    public void setFullLegalName(String fullLegalName) {
        this.fullLegalName = fullLegalName.split(" ");
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

    public Double getGPAScore() {
        return GPAScore;
    }
    public void setGPAScore(Double GPAScore) {
        this.GPAScore = GPAScore;
    }

    @Override
    public String toString() {
        return "GPAStudent{" +
                "name=" + Arrays.toString(fullLegalName) +
                ", ID=" + ID +
                ", GPAScore=" + GPAScore +
                '}';
    }

    @Override
    public int compareTo(GPAStudent other) {
        return this.GPAScore.compareTo(other.getGPAScore());
    }

}
