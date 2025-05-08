// public class thiskeyword {
//     int age=15;
//     void data(){      
//         System.out.println(this);
//     }
//     public static void main(String[] args) {
//         thiskeyword obj = new thiskeyword();
//         obj.data();
//         System.out.println(obj.age);
        
//     } 
// }
class student {
    int age;
    student(int age){
       this.age=age;//provide initial value when "this" keyword is not used
    }
    void data(){
        System.out.println(age);
    }
}
public class thiskeyword {
    public static void main(String[] args) {
    student obj=new student(16);
    obj.data();

    }
    
}