import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        int[] arr ={4,7,-8,9,-4,5};
        int sum=0;

        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        for(int i=0; i<arr.size(); i++){
            sum += arr.get(i);
        }

        

        System.out.println(arr);

        // arr.add("radhe");
        // arr.add("manu");
        // arr.add(1,"radhika");
        // arr.add("shree");
        // arr.add(2,"jijw");
        // arr.remove(2);
        // arr.set(3, "modi");
        // Collections.sort(arr);
        // // arr.clear();
        // arr.addFirst("gtj");
        // System.out.println(arr);    
        
    }
    
}
