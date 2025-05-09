 class bankaccount{
    private int balance;
    void setdeposite(int balance){
      this.balance=balance;
    }
    int getwithdraw(){
        return balance;
    }
 }

public class question3 {
    public static void main(String[] args) {
        bankaccount obj=new bankaccount();
        obj.setdeposite(6700);
        System.out.println(obj.getwithdraw());
        
    }
    
}
