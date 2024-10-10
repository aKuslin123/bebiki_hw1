package org.example.student;

public class Student implements Printable {
    private String name;
    private String studentBookNumber;
    private double averageScore;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStudentBookNumber(String studentBookNumber) {
        this.studentBookNumber = studentBookNumber;
    }

    public String getStudentBookNumber() {
        return studentBookNumber;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public void print() {
        System.out.println("Имя - " + this.name);
        System.out.println("Номер зачетки - " + this.studentBookNumber);
        System.out.println("Средний балл - " + this.averageScore);
    }
}
