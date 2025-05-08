import java.util.*;

public class questions2 {
    static void printnumber(int number){
        for(int i=1;i<=number;i++){
        System.out.println(i+" ");
       }
       System.out.println();
    }
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int number =a.nextInt();
        System.out.println("natural no. upto  "+number);
        printnumber(number);
    }
    
}
