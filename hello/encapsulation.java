class ATM{
    int a;
    void setrupees(int a){
        this.a=a;
    }
    int getrupees(){
        return 0;
    }

}
public class encapsulation {
    public static void main(String[] args) {
        
        ATM obj = new ATM();
        obj.setrupees(5890);
        System.out.println(obj.getrupees());
    }
    
}
