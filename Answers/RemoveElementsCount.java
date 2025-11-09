import java.util.Arrays;

public class RemoveElementsCount {
    public int eliminateRepeats(int[] values) {
        if (values.length == 0) return 0;

        int writeIndex = 1; // position to write next unique number
        int count = 0;

        // Step 1: Remove consecutive duplicates in place
        for (int i = 1; i < values.length; i++) {
            if (values[i] != values[i - 1]) {
                values[writeIndex] = values[i];
                writeIndex++;
            } else {
                count++; // counts duplicates
            }
        }

        // Step 2: Copy only unique elements to new array
        int[] arr = new int[writeIndex];
        for (int i = 0; i < writeIndex; i++) {
            arr[i] = values[i];
        }

        System.out.println(Arrays.toString(arr));
        return count;
    }

    public static void main(String[] args) {
        RemoveElementsCount dr = new RemoveElementsCount();
        int[] values = {1, 1, 2, 2, 3, 3, 3, 4};

        int duplicates = dr.eliminateRepeats(values);
        System.out.println("Duplicate count: " + duplicates);
    }
}
