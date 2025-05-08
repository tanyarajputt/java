public class twodarray {
    public static void main(String[] args){
        int arr[]={1,2,3,4};
        int arr2[]={2,3,4,5};
        int[] m= new int[arr.length+arr2.length];
        for(int i=0;i<arr.length;i++){
            m[i]=arr[i];
        }
        for( int j=0;j<arr2.length;j++){
            m[arr.length+j]=arr[j];
        }
        System.out.println("the value of"+m);
    }
    
}
