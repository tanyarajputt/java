class person{
    void displayname(){
        System.out.println("show me your name");
    }
}
class student extends person{
    void displayclass(){
        System.out.println("view student");
    }
}
class monitor extends student{
    void checkdiscipline(){
        System.out.println("maintain class");
    }
}
public class multiinheri {
    public static void main(String[] args) {
        person obj1=new person();
        obj1.displayname();
        student obj2=new student();
        obj2.displayclass();
        obj2.displayname();
        monitor obj=new monitor();
        obj.displayname();
        obj.displayclass();
        obj.checkdiscipline();
    }
    
}
