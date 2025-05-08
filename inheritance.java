class animal{
    void eat(){
        System.out.println("eating");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("barking");
    }
}
class puppy extends dog{
    void sleep(){
        System.out.println("sleeping");
    }
    
}
class cat  extends animal{
    void lazy(){
        System.out.println("lazyyy");
    }
}
public class inheritance {
    public static void main(String[] args) {
        System.out.println("properties of puppy class : ");
        puppy obj=new puppy();
        obj.eat();
        obj.bark();
        obj.sleep();
        System.out.println("properties of cat class :");
        cat obj1=new cat();
        obj1.lazy();
        obj1.eat();
    }
    
}
