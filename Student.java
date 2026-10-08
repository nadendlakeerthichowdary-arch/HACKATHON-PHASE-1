import java.util.Scanner;

public class Student {
    String studentName, rollNumber, courseName;
    double marks;
    int courseCredits;

    public Student(String studentName, String rollNumber, double marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    public boolean checkEligibility() {
        return marks >= 50;
    }

    public double calculateFee() {
        return courseCredits * 1500;
    }

    public double calculateScholarship() {
        if (marks >= 85) return calculateFee() * 0.20;
        if (marks >= 70) return calculateFee() * 0.10;
        return 0;
    }

    public double calculateFinalFee() {
        return calculateFee() - calculateScholarship();
    }

    public void displayDetails() {
        System.out.println("\nName: " + studentName);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Course: " + courseName);
        System.out.println("Credits: " + courseCredits);
        System.out.println("Eligible: " + checkEligibility());
        System.out.println("Total Fee: " + calculateFee());
        System.out.println("Scholarship: " + calculateScholarship());
        System.out.println("Final Fee: " + calculateFinalFee());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        String roll = sc.nextLine();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();
        System.out.print("Enter Credits: ");
        int credits = sc.nextInt();

        Student s = new Student(name, roll, marks, course, credits);

        if (s.checkEligibility()) {
            s.displayDetails();
        } else {
            System.out.println("\nStudent is not eligible for registration.");
        }

        sc.close();
    }
}