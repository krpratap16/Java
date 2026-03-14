import java.util.*;

public class SelectionShort {

    public static void main(String[] args) {

        int nums[] = {6, 5, 2, 8, 9, 4};
        int size = nums.length;

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < size; i++) {

            int maxIndex = i;

            for (int j = i + 1; j < size; j++) {
                if (nums[maxIndex] < nums[j]) {
                    maxIndex = j;
                }
            }

            int temp = nums[maxIndex];
            nums[maxIndex] = nums[i];
            nums[i] = temp;

            System.out.println("After iteration " + i + ": " + Arrays.toString(nums));
        }

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(nums));
    }
}
