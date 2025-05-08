class demo{
    void sum(int a){
        System.out.println("given no. is "+a);
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void sum(double e){
        System.out.println("given no. is "+e);
    }
    void sum(double e,double f){
        System.out.println(e+f);
    }
    void sum(double e,double f,double g){
        System.out.println(e+f+g);
    }
}

public class overloading{
    public static void main(String[] args) {
        demo obj = new demo();
        obj.sum(9);
        obj.sum(9,22);
        obj.sum(9,22,56);
        obj.sum(67.9);
        obj.sum(67.9,56.8);
        obj.sum(67.9,56.8,89.45);
    }

}


