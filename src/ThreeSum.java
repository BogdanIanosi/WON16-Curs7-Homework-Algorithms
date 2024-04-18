import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {1, 4, 7, 2, 9, 5, 3};
        int target = 15;

        findThreeSum(nums, target);
    }

    public static void findThreeSum(int[] nums, int target) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                if (currentSum == target) {
                    System.out.println("Numbers found : " + nums[i] + ", " + nums[left] + ", " + nums[right]);
                    return;
                } else if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        System.out.println("No 3 numbers matching the target were found.");
    }
}