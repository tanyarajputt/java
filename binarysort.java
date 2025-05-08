// public class binarysort {
// //     static void Bubblesort(int[] arr){
// //     for(int i=0;i<arr.length-1;i++){
// //         for(int j=0;j<arr.length-i-1;j++){
// //             if(arr[j]>arr[j+1]){
// //                 int temp=arr[j];
// //                 arr[j]=arr[j+1];
// //                 arr[j+1]=temp;
// //             }
// //         }
// //     }
// // }



// public static void main(String[] args) {
// //     int[] arr={4,1,5,7,2,6,3,8};
// //     Bubblesort(arr);
// //     System.out.println(arr);
// //     for(int i=0;i<arr.length;i++){
// //         System.out.println(arr[i]);
// //     }

// // }
//     int arr[] ={1,2,3,4,5,6,7,8};
//     int target =3;
//     int start= 0;
//     int endpoint= arr.length-1;

//         int midpoint =(( start + endpoint)/2);       
    
//     if(midpoint==target){
//         System.out.println(target);
//     }
//     else if( midpoint>=target){
//         midpoint =arr.length-1;
//        System.out.println();
//     }
//     else{

//     }


//   }

// }   

class binarysort{
    static void bsort(string[] str){
        
        for(int i=0;i<str.length-1;i++){
            for(int j=0;j<str.length-i-1;j++){
                if((int)str[j].charAt(0)>(int)str[j+1].charAt(0)){
                    string temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        string[] str={"B","A","C"};
        bsort(str);
        System.out.println(str);
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }

    }
    
}
