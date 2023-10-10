package week5.Exercise88;

public class Student {
    private String name;
    private String StudentNumber;

    public Student(String name, String studentNumber) {
        this.name = name;
        this.StudentNumber = studentNumber;
    }
    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return StudentNumber;
    }

    public String toString() {
      return getName() + " " + getStudentNumber();
    }
}
