public class string2 {
    public static void main(String[] args) {
        // String str="hello"; 
    //     String newstr ="";
//print the 1st repeated character 
    //     for( int i=0;i<str.length();i++){
    //         char c=str.charAt(i);
    //         if(newstr.indexOf(c)==-1){
    //             newstr+=c;
    //         }
    //     }
    // System.out.println(newstr);

    // char[] ch= str.toCharArray();
    
    // for(int i=0;i<ch.length;i++){
    //     for(int j=i+1;j<ch.length;j++){
    //         if(ch[i]==ch[j]){
    //             System.out.println(ch[i]);
    //             return;
    //         }
    //     }
    //     System.out.println(ch[i]);
    // }

    // String str ="helool";
    // char[] ch=str.toCharArray();

    //  String str="hello";
    //  System.out.println(str.concat("hiii"));
    //  System.out.println(str);

    //  StringBuilder str=new StringBuilder(10);
    //  str.append("hii");
    //  System.out.println(str.length());
    // str.append("hiii");
    // System.out.println(str);

    // write a program to print missing element from an array
            int arr[] ={3,0,1,2,5};
            int n = arr.length + 1;
            int expectedSum = n * (n + 1) / 2;
            int actualSum = 0;
            for (int num : arr) {
                actualSum += num;
            }
            int missingElement = expectedSum - actualSum;
            System.out.println("The missing element is: " + missingElement);
        
    }
}
//STRING POOL
//  string str="hello";
// string str1="hello";( both variable store in same memory location)


// String str= new String("hello");
// String str= new String("hello");(both variable store in different memory location)
        
