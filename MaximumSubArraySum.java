public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum=  optimalSolution(nums);
        System.out.println("Maximum Sub Array Sum : "+maxSum);
    }

    // Time Complexity   : O(n)
    // Space Complexity  : O(1)
    private static int optimalSolution(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : nums) {
            sum += i;
            if (sum > maxSum) maxSum = sum;
            if (sum < 0) sum = 0;
        }
        return Math.max(maxSum, 0);
    }
}
