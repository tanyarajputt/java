public class hello {
    static void Bubblesort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    // int a=9;
    public static void main(String[] args) {
        // hello obj= new hello();
        // System.out.println(obj.a);
        int[] arr={2,1,34,2,45,2,5,0};
        Bubblesort(arr);
        System.out.println(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    
}
