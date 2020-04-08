import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(12);
        arr.add(5);
        arr.add(21);
        arr.add(26);
        arr.add(25);
        arr.add(12);
        arr.add(22);
        System.out.println("truoc khi sap xep");
        for (int i = 0; i <arr.size() ; i++) {
            System.out.print(arr.get(i)+" ");
        }
        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println("sau khi sap xep");
        for (int i = 0; i <arr.size() ; i++) {
            System.out.print(arr.get(i)+" ");
        }
    }
}
