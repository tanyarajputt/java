public class pattern {
    public static void main(String[] args){
        System.out.println("pattern of square");
        // for(int i=1; i<5;i++){
        //     for(int j=1; j<5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        System.out.println("pattern of inreasing triangle");
        //  for(int i=1; i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //          System.out.print("*");
        //     }
        //      System.out.println();
        //}
        
        System.out.println("pattern of decreasing triangle");
         for(int i=5;i>=1;i--){
             for(int j=1;j<=i;j++ ){
                 System.out.print("* ");
             }
             System.out.println();
         }
         
        //  System.out.println(" printing triangle on right side");
        //  for(int i=1;i<=5;i++){
        //     for(int j=4; j>=0 ;j--){
        //         System.out.println(" ");
        //     }
        //     for(int k=1; k<=i; k++ ){
        //         System.out.print("*");
        //     }
        //  }
        //  System.out.println();
    }
    
}
