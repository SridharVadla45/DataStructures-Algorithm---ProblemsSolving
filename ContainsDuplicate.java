import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4,1};
      boolean isDuplicates=  optimalDuplicates(nums);
      System.out.println(isDuplicates);
    }

    // Time Complexity :O(n) for traversing array .
    // Space Complexity :O(n) for storing distinct elements in array .
    private static boolean optimalDuplicates(int [] nums){

        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)) return true;
            set.add(i);
        }

        return false;
    }

    // Time Complexity :O(nlogn) for sorting + O(n) for traversing through array .
    //Space Complexity : O(1) no space used
    private static boolean betterDuplicates(int [] nums){

        // nlogn for sorting
        Arrays.sort(nums);
        // O(n) for traversing
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) return true;
        }

        return false;
    }

}
