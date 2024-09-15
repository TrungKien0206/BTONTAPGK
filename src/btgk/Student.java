package btgk;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student extends Person {

    private float gpa;
    private String major;

    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(dateOfBirth);
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + formattedDate);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
        System.out.println("----------------------------------");

    }

    public void addStudent(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gpa = gpa;
        this.major = major;

    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
