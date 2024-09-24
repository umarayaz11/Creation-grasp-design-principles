
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String toString() {
        return "Student: " + name + ", Age: " + age;
    }
}


 class University {
    private String name;
    private List<Student> students;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public Student createStudent(String name, int age) {
        // Check if the student is eligible to be created
        if (age >= 18) {
            Student student = new Student(name, age);
            students.add(student);
            return student;
        } else {
            return null;
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public static void main(String[] args) {
        University university = new University("Example University");
        Student student1 = university.createStudent("John Doe", 20);
        Student student2 = university.createStudent("Jane Doe", 17);

        System.out.println(student1);  // Student: John Doe, Age: 20
        System.out.println(student2);  // null

        System.out.println(university.getStudents());  // [Student: John Doe, Age: 20]
    }
}