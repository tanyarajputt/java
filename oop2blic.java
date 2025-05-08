class student{
    String name ="krishna";
    void sum( int a,int b){
        System.out.println(a+b);
    }
    void number(int c,double d ){
        double e = c-d;
        System.out.println(e);
    }
}
class fullname{
    String firstname="Rishi";
    String midname="raj";
    String lastname="kanoujiya";
    void name(){
        System.out.println(firstname+" "+midname+" "+lastname);
    }
}
class rectangle{
    void area(int l,int w){
        System.out.println("area of rectangle : "+l*w);
    }
}
public class oop2blic  {
    public static void main(String[] args) {
        student obj= new student();
        student obj1 =new student();
        obj.sum(5,7);
        obj1.number(56, 9.70);
        System.out.println(obj1.name);
        rectangle obj2 =new rectangle();
        obj2.area(7,8);
        fullname obj3=new fullname();
        obj3.name();

    }
}
