class Student {
    String firstname = "radhika";
    int age = 16;
    Student(){
       System.out.println("hello");
    }
    Student(String firstname){
        this();
        System.out.println(firstname);
    }
    Student(String firstname, int age) {
        this(firstname);
        this.firstname=firstname;
        // firstname = b;
        // age = a;
        System.out.println(firstname + "  " + age);
        System.out.println();
    }
}

class Constructor {
    public static void main(String[] args) {
    
        Student obj = new Student("mmmm+", 16);
        // Student obj1 = new Student("vanshika",15);
        // System.out.println(obj.firstname);
        // System.out.println(obj1.firstname);
    }
}