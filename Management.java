class Person {
    protected String fullName;
    protected int birthYear;

    public Person(String fullName, int birthYear) {
        this.fullName = fullName;
        this.birthYear = birthYear;
    }

    public void displayInfo() {
        System.out.println("Full name: " + fullName);
        System.out.println("Birth year: " + birthYear);
    }
}

class Lecturer extends Person {
    private String lecturerId;

    public Lecturer(String fullName, int birthYear, String lecturerId) {
        super(fullName, birthYear);
        this.lecturerId = lecturerId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Lecturer ID: " + lecturerId);
    }
}

class Student extends Person {
    private String studentId;

    public Student(String fullName, int birthYear, String studentId) {
        super(fullName, birthYear);
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}
class OtherStaff extends Person {
    private String position;

    public OtherStaff(String fullName, int birthYear, String position) {
        super(fullName, birthYear);
        this.position = position;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Position: " + position);
    }
}
public class Management {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("Nguyen Van A", 1980, "L001");
        Student student = new Student("Le Thi B", 2000, "S001");
        OtherStaff staff = new OtherStaff("Pham Van C", 1975, "Security");

        System.out.println("Lecturer information:");
        lecturer.displayInfo();

        System.out.println("\nStudent information:");
        student.displayInfo();

        System.out.println("\nOther staff information:");
        staff.displayInfo();
    }
}
