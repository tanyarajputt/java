class Student {
    private String name;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

public class encap2 {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student();
        obj.setName("vanshika");
        System.out.println(obj.getName());
        obj1.setMarks(97);
        System.out.println(obj1.getMarks());

    }
}