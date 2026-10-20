
import java.util.Arrays;

public class L1TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};

    }
    public static void main(String[] args) {
        int[] num1 = {5,6,9,8,1};
        int target1 = 9;
        System.out.println(Arrays.toString(twoSum(num1, target1)));


        int[] num2 = {4, 8, 9};
        int target2 = 12;
        System.out.println(Arrays.toString(twoSum(num2, target2)));
    }

}
