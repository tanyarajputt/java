// class vehicle{
//     void run(){
//         System.out.println("it has a proprety to run");
//     }
// }
// class bike extends vehicle{
//     void run(){
//         System.out.println("runnn");
        
//     }

// }
// public class overriding {
//     public static void main(String[] args) {
//         vehicle obj =new bike();
//         obj.run();
//     }
    
//}


class vehicle{
    void run(){
        System.out.println("it has a proprety to run");
    }
}
class bike extends vehicle{
    void run(){
        System.out.println("runnn");
        super.run();//print both class at a single call
    }

}
public class overriding {
    public static void main(String[] args) {
        vehicle obj =new bike();
        obj.run();
    }

}