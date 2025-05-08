class shape{
    void circle(){
        System.out.println("radius of a circle: ");

    }
}
class draw extends shape{
    void calculatearea(){
        System.out.println("area");
    }
}
public class singleinheri {
    public static void main(String[] args) {
        shape obj1=new shape();
        obj1.circle();
        draw obj=new draw();
        obj.circle();
        obj.calculatearea();
        
    }
    
}
