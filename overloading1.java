class shape{
    void area(int a){
        System.out.println(" area of square  : "+a*a);
    }
    void area(int a,int b){
        System.out.println("area of rectangle : "+a*b);
    }
    void area(double r){
        System.out.println("area of circle : "+ 2*3.14*r*r);
    }
    void area(double l, double w){
        System.out.println("area of triangle is :"+ 0.5*l*w);
    }

}
public class overloading1 {
    public static void main(String[] args) {
        shape obj = new shape();
        obj.area(34);
        obj.area(34,27);
        obj.area(6.89);
        obj.area(7.3,8.5);

    }
    
}
