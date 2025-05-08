public class string {
    public static void main(String[]args){
        
        
    //     for(int i=0;i<str.length();i++){
    //         System.out.println(str.charAt(i));
    // }

    // for( int j=str.length()-1;j>=0;j--){
    //     System.out.println(str.charAt(j));
    // }

    string str= "eye";
    string rev="";
    for(int i=str.length()-1;i>=0;i--){
        rev+=str.charAt(i);
    }
    System.out.println(rev);
    if(str.equal(rev)){
        System.out.println("pallidrome");
    }
    else{
        System.out.println("not");
    }
    
}

}
