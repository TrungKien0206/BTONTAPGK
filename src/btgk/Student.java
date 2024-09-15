package btgk;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student extends Person {

    private float gpa;
    private String major;
    private final float TUITION_FEE = 10000000; // Học phí cố định 10,000,000

    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    // Phương thức tính học phí sau khi áp dụng học bổng
    public float calculateTuitionFee() {
        if (gpa >= 9) {
            return TUITION_FEE * 0.5f; // Giảm 50% nếu GPA >= 9
        }
        return TUITION_FEE; // Không giảm nếu GPA < 9
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(dateOfBirth); // Định dạng lại ngày sinh
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + formattedDate);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);

        // Kiểm tra có học bổng hay không
        if (gpa >= 9) {
            System.out.println("Scholarship: Yes (50% tuition reduction)");
        } else {
            System.out.println("Scholarship: No");
        }

        // Hiển thị học phí sau khi áp dụng học bổng
        System.out.println("Tuition Fee: " + calculateTuitionFee() + " VND");
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
