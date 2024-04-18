import java.util.*;

public class PairSum {
    public static void findPairs(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            System.out.println("Array should have at least 2 elements");
            return;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                System.out.println("(" + complement + "," + num + ")");
            }
            map.put(num, num);
        }
    }

    public static void main(String[] args) {
        int[] nums = {8, 7, 2, 5, 3, 1};
        int target = 10;
        findPairs(nums, target);
    }
}
