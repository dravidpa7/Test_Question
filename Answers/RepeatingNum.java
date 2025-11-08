import java.util.HashSet;
import java.util.Set;

public class RepeatingNum {

    public void removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println("Array after removing duplicates: " + set);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 3, 2, 4, 5, 5};
        RepeatingNum obj = new RepeatingNum();
        obj.removeDuplicates(arr);
    }
}
