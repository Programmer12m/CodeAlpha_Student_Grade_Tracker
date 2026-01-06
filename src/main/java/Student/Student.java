package Student;

import java.util.Arrays;

public class Student {
    private final int studentId;
    private final String studentName;
    Calculations calculations;
    private int rollNumber;
    private char grade;
    private int studentClass;
    private int[] marks = new int[5];
    private int totalNumber;
    private double percentage;


    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        calculations = new Calculations();
    }

    private void calculateTotalNumbers(int[] array) {
        int sum = 0;
        for (int n : array) {
            sum += n;
        }

        double average = (double) sum / array.length;
        System.out.println("Average number= " + average);
        double percentage = (double) (sum * 100) / 500;
        System.out.println("Total Numbers = " + sum + " Percentage = " + percentage);
        this.percentage = percentage;
        this.totalNumber = sum;
        System.out.println("Grade = "+(this.grade=calculations.calculateGrade(sum)));
    }

    protected void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    protected void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public char getGrade() {
        return grade;
    }

    protected void setGrade(char grade) {
        this.grade = grade;
    }

    public void marksEachSubject(int[] marks) {
        System.out.println("marks = " + Arrays.toString(marks));

    }

    protected void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    protected void setTotalNumber(int totalNumber) {

        this.totalNumber = totalNumber;
    }

    public void getMarkEachSubject() {
        System.out.println("Marks in each subject = " + Arrays.toString(this.marks));

    }


    public double getPercentage() {
        return percentage;
    }

    protected void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void displayStudentinfo() {
        System.out.println("****************************");
        System.out.println("Student Info:");
        System.out.println("Name: " + studentName);
        System.out.println("rollNumber = " + rollNumber);
        System.out.println("studentClass = " + studentClass + "grade = " + grade);
        System.out.println("grade = " + grade);
        System.out.println();
        System.out.println("Result Info:");
        getMarkEachSubject();
        System.out.println(getTotalNumber());
        System.out.println(getPercentage());
        System.out.println(getGrade());
        System.out.println("thanks");

    }

}
