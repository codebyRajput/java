class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    int studentId;
    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }
    void displayStudent() {
        System.out.println("Student ID: " + studentId);
        display(); 
    }
}
class Teacher extends Person {
    String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    void displayTeacher() {
        System.out.println("Subject: " + subject);
        display(); 
    }
}

// Main class for testing
public class InheritanceExample {
    public static void main(String[] args) {
        Student student = new Student("Aditya raj", 19, 111);
        System.out.println("Student Information:");
        student.displayStudent();
        System.out.println();
        Teacher teacher = new Teacher("amrendra", 25, "oops");
        System.out.println("Teacher Information:");
        teacher.displayTeacher();
    }
}
