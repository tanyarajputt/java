abstract class Payment{
    abstract  void pay(int a);
    void success(){
        System.out.println("payment done");
    }
}
class Upipayment extends Payment{
    void pay(int a){
System.out.println("pay via upi"+a);
    }
}   
class Netbanking extends Payment{
    void pay(int b){
        System.out.println("pay via netbanking"+b);
    }
}
public class abs{
    public static void main(String[] args) {
       Payment obj=new Upipayment() ;
       obj.pay(6700);
       obj.success();
      Payment obj1=new Netbanking();
      obj1.pay(78000);
      obj1.success();
    }

}
