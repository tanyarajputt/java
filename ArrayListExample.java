import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        int[] arr = {4, 7, -8, 9, -4, 5};
        int sum = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        System.out.println("ArrayList: " + list);
        System.out.println("Sum of elements: " + sum);

        Collections.sort(list);

        System.out.println("Modified and Sorted ArrayList: " + list);
    }
}
