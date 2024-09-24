
import java.util.List;

// Student.java
public class Student2 {
    private String name;
    private int age;

    public Student2String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student: " + name + ", Age: " + age;
    }
}

// University.java
 class University {
    private String name;
    private List<Student> students;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public static void main(String[] args) {
        University university = new University("Example University");
        Student student1 = new Student("John Doe", 20);
        Student student2 = new Student("Jane Doe", 17);

        if (student1.getAge() >= 18) {
            university.addStudent(student1);
        } else {
            System.out.println("Student " + student1.getName() + " is not eligible to be added.");
        }

        if (student2.getAge() >= 18) {
            university.addStudent(student2);
        } else {
            System.out.println("Student " + student2.getName() + " is not eligible to be added.");
        }

        for (Student student : university.getStudents()) {
            System.out.println(student);
        }
    }
}