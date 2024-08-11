import java.util.Arrays;

public class ProductArrayExceptSelf {


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
//        nums = productExceptSelf(nums);
//        System.out.println(Arrays.toString(nums));

        nums=optimalProductExceptSelf(nums);
        System.out.println(Arrays.toString(nums));
    }


    // Time Complexity  :O(n*n)
    // Space Complexity :O(1)
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] != nums[j]) product *= nums[j];
            }
            ans[i] = product;
        }

        return ans;

    }

    private static int[] optimalProductExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];


        int preprod=1;

        for (int i = 0; i < nums.length; i++) {
            ans[i]=preprod;
            preprod*=nums[i];
        }

        System.out.println("nums : "+Arrays.toString(nums));
        System.out.println("Preproduct : "+Arrays.toString(ans));

        int postproduct=1;
        for(int i=nums.length-1 ;i>=0;i--){
            ans[i]*=postproduct;
            postproduct*=nums[i];
        }


        return ans;

    }
}
