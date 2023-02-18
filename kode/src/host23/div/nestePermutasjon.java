package host23.div;

import java.util.Arrays;

public class nestePermutasjon {
    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[]liste = {1,2,3,4,5};
        System.out.println(Arrays.toString(liste));

        int fakultet = 1;
        for(int i = 2; i < liste.length+1; i++){
            fakultet *= i;
        }

        for(int i = 0; i < fakultet-1; i++){
            nextPermutation(liste);
            System.out.println(Arrays.toString(liste));
        }
    }
}
