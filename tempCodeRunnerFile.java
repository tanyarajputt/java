

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

