import java.util.Scanner;

public class conditonal5 {
    public static void main(String[] args){
         Scanner kcc=new Scanner(System.in);
        
        int a=kcc.nextInt();
        System.out.println("first number : "+a); 

        int b=kcc.nextInt();
        System.out.println("second number : "+b);

        // if(a % 2 == 0)
        // System.out.println("number is even");
        // else
        // System.out.println("number is odd");

        // if(a >0)
        // System.out.println("positive");
        // else if( a<0)
        // System.out.println("negative");
        // else
        // System.out.println("zero");

        if(a > b)
        System.out.println("a is greater ");
        else
        System.out.println("b is greater");


    }
    
    
}
