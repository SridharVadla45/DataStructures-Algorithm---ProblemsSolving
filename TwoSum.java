import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int [] arr = {2,11,15,14,7};

        System.out.println("Brute  Approach");
        int [] ans = bruteTwoSum(arr,9);
        System.out.println(Arrays.toString(ans));


        System.out.println("Better Approach");
        int [] ans1 = betterTwoSum(arr,9);
        System.out.println(Arrays.toString(ans1));
    }

   // Time Complexity : O(n*n) Space Complexity= O(1)
    private static int [] bruteTwoSum(int [] nums, int target){

        int [] ans = new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target) {
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return  ans;

    }

    // Time Complexity :  O(n) for traversing through array
    // Space Complexity : O(n) for storing values if not found and O(1) for returning answer
    private static int [] betterTwoSum(int [] nums, int target){

        int [] ans = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            if(!map.isEmpty() && map.containsKey(target-nums[i]) ){
                ans[0]=map.get(target-nums[i]);
                ans[1]=i;
                return ans;
            }else{
                map.put(nums[i],i);
            }
        }
        return  ans;
    }
}
