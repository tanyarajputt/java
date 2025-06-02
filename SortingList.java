 import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }
   
    public String toString() {
        return "Student{name='" + name + "', age=" + age + '}';
    }
}
public class SortingList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));
        students.add(new Student("Charlie", 19));

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students);

        System.out.println("\nAfter sorting by name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
