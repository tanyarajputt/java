// single level inheritance
class employe{
    void work(){
        System.out.println("workinggg");
    }
}
class manager extends employe{
    void attendmeeting(){
        System.out.println("attend meeting");
    }
}
public class inheritance1 {
    public static void main(String[] args) {
        employe obj1 = new employe();
        obj1.work();
        manager obj= new manager();
        obj.work();
        obj.attendmeeting();

    }
    
}
