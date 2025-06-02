// import java.util.*;

// class Student {
//     private int rollNumber;
//     private String name;

//     public Student(int rollNumber, String name) {
//         this.rollNumber = rollNumber;
//         this.name = name;
//     }

//     public int getRollNumber() {
//         return rollNumber;
//     }

//     public String getName() {
//         return name;
//     }

//     public String toString() {
//         return "Student{rollNumber=" + rollNumber + ", name='" + name + "'}";
//     }
// }

// class RollNumberComparator implements Comparator<Student> {
    
//     public int compare(Student s1, Student s2) {
//         return Integer.compare(s2.getRollNumber(), s1.getRollNumber()); // Descending order
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         List<Student> students = new ArrayList<>();
//         students.add(new Student(101, "radhika"));
//         students.add(new Student(103, "radhe"));
//         students.add(new Student(102, "Charlie"));

//         students.sort(new RollNumberComparator());

//         System.out.println("Sorted Students:");
//         for (Student s : students) {
//             System.out.println(s);
//         }
//     }
// }


// class Student {
//     private int age;
//     private String name;

//     public Student(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public String getName() {
//         return name;
//     }

    
//     public String toString() {
//         return "Student{age=" + age + ", name='" + name + "'}";
//     }
// }

// class AgeNameComparator implements Comparator<Student> {
//     public int compare(Student s1, Student s2) {
//         int ageCompare = Integer.compare(s1.getAge(), s2.getAge()); // Ascending order
//         if (ageCompare == 0) {
//             return s1.getName().compareTo(s2.getName()); // Alphabetical order
//         }
//         return ageCompare;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         List<Student> students = new ArrayList<>();
//         students.add(new Student(21, "Aiya"));
//         students.add(new Student(20, "kiya"));
//         students.add(new Student(22, "hari"));

//         students.sort(new AgeNameComparator());

//         System.out.println("Sorted Students:");
//         for (Student s : students) {
//             System.out.println(s);
//         }
//     }

// }

// import java.util.*;

// class Student {
//     private int rollNumber;
//     private String name;

//     public Student(int rollNumber, String name) {
//         this.rollNumber = rollNumber;
//         this.name = name;
//     }

//     public int getRollNumber() {
//         return rollNumber;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() {
//         return "Student{rollNumber=" + rollNumber + ", name='" + name + "'}";
//     }
// }

// class RollNumberComparator implements Comparator<Student> {
//     @Override
//     public int compare(Student s1, Student s2) {
//         return Integer.compare(s2.getRollNumber(), s1.getRollNumber()); // Descending order
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         List<Student> students = new ArrayList<>();
//         students.add(new Student(101, "Alice"));
//         students.add(new Student(103, "Bob"));
//         students.add(new Student(102, "Charlie"));

//         students.sort(new RollNumberComparator());

//         System.out.println("Sorted Students:");
//         for (Student s : students) {
//             System.out.println(s);
//         }
//     }
// }

// import java.util.*;

// class Student implements Comparable<Student> {
//     private int rollNumber;
//     private String name;

//     public Student(int rollNumber, String name) {
//         this.rollNumber = rollNumber;
//         this.name = name;
//     }

//     public int getRollNumber() {
//         return rollNumber;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public int compareTo(Student other) {
//         return Integer.compare(this.rollNumber, other.rollNumber); // Ascending order
//     }

//     @Override
//     public String toString() {
//         return "Student{rollNumber=" + rollNumber + ", name='" + name + "'}";
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         List<Student> students = new ArrayList<>();
//         students.add(new Student(101, "alu"));
//         students.add(new Student(103, "hie"));
//         students.add(new Student(102, "hello"));

//         Collections.sort(students); // Sort using Comparable

//         System.out.println("Sorted Students:");
//         for (Student s : students) {
//             System.out.println(s);
//         }
//     }
// }

// import java.util.*;

// class Student {
//     private int age;
//     private String name;

//     public Student(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() {
//         return "Student{age=" + age + ", name='" + name + "'}";
//     }
// }

// class AgeNameComparator implements Comparator<Student> {
//     @Override
//     public int compare(Student s1, Student s2) {
//         int ageCompare = Integer.compare(s2.getAge(), s1.getAge()); // Descending order for age
//         if (ageCompare == 0) {
//             return s2.getName().compareTo(s1.getName()); // Descending order for name
//         }
//         return ageCompare;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         List<Student> students = new ArrayList<>();
//         students.add(new Student(21, "Alice"));
//         students.add(new Student(20, "Bob"));
//         students.add(new Student(20, "Charlie"));

//         students.sort(new AgeNameComparator());

//         System.out.println("Sorted Students:");
//         for (Student s : students) {
//             System.out.println(s);
//         }
//     }
// }

// import java.util.*;

// class Student {
//     private int age;
//     private String name;

//     public Student(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public String getName() {
//         return name;
//     }

//     public String toString() {
//         return "Student{age=" + age + ", name='" + name + "'}";
//     }
// }

// class AgeNameComparator implements Comparator<Student> {

//     public int compare(Student s1, Student s2) {
//         int ageCompare = Integer.compare(s2.getAge(), s1.getAge()); // Descending order for age
//         if (ageCompare == 0) {
//             return s2.getName().compareTo(s1.getName()); // Descending order for name
//         }
//         return ageCompare;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         List<Student> students = new ArrayList<>();
//         students.add(new Student(21, "Alice"));
//         students.add(new Student(20, "Bob"));
//         students.add(new Student(20, "Charlie"));

//         students.sort(new AgeNameComparator());

//         System.out.println("Sorted Students:");
//         for (Student s : students) {
//             System.out.println(s);
//         }
//     }
// }

// import java.util.*;

// class Student {
//     private int age;
//     private String name;

//     public Student(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public String getName() {
//         return name;
//     }

//     public String toString() {
//         return "Student{age=" + age + ", name='" + name + "'}";
//     }
// }

// class AgeNameComparator implements Comparator<Student> {

//     public int compare(Student s1, Student s2) {
//         int ageCompare = Integer.compare(s2.getAge(), s1.getAge()); // Descending order for age
//         if (ageCompare == 0) {
//             return s2.getName().compareTo(s1.getName()); // Descending order for name
//         }
//         return ageCompare;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         List<Student> students = new ArrayList<>();
//         students.add(new Student(21, "Alice"));
//         students.add(new Student(20, "Bob"));
//         students.add(new Student(20, "Charlie"));

//         students.sort(new AgeNameComparator());

//         System.out.println("Sorted Students:");
//         for (Student s : students) {
//             System.out.println(s);
//         }
//     }
// }

// // import java.util.*;

// // class Student {
// //     private int age;
// //     private String name;

// //     public Student(int age, String name) {
// //         this.age = age;
// //         this.name = name;
// //     }

// //     public int getAge() {
// //         return age;
// //     }

//     public String getName() {
//         return name;
//     }


//     public String toString() {
//         return "Student{age=" + age + ", name='" + name + "'}";
//     }
// }

// class AgeNameComparator implements Comparator<Student> {

//     public int compare(Student s1, Student s2) {
//         int ageCompare = Integer.compare(s2.getAge(), s1.getAge()); // Descending order for age
//         if (ageCompare == 0) {
//             return s2.getName().compareTo(s1.getName()); // Descending order for name
//         }
//         return ageCompare;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         List<Student> students = new ArrayList<>();
//         students.add(new Student(21, "Alice"));
//         students.add(new Student(20, "Bob"));
//         students.add(new Student(20, "Charlie"));

//         students.sort(new AgeNameComparator());

//         System.out.println("Sorted Students:");
//         for (Student s : students) {
//             System.out.println(s);
//         }
//     }
// }