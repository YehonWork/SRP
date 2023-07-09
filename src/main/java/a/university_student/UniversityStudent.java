package a.university_student;

public class UniversityStudent {
    String firstName;
    String lastName;
    int age;

    public UniversityStudent(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.payFee();
    }

    public void payFee() {}

    public String reportAttendance() {
        return null;
    }
}

