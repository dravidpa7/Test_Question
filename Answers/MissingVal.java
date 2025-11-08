import java.util.HashSet;
import java.util.Set;

public class MissingVal {

    public int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public void missingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;
        System.out.println("Missing number is: " + missing);
    }


    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 3, 2, 4, 5, 5};
        MissingVal obj = new MissingVal();
        int[] originalArray = obj.removeDuplicates(arr);
        obj.missingNumber(originalArray, originalArray.length);
    }
}
