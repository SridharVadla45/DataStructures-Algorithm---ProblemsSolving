import java.util.HashMap;

public class ContainsDuplicates2 {

    public static void main(String[] args) {
        int [] nums ={1,2,3,4,5,6,1};

    boolean isDuplicates =  containsNearbyDuplicate(nums,3);
    System.out.println(isDuplicates);


    }


    public static boolean containsNearbyDuplicate(int[] nums, int k) {

//        return bruteContainsNearbyDuplicate(nums,k);

        return  optimalContainsNearbyDuplicate(nums,k);
    }


    //Time Complexity : approx O(n*n)
    // Space Complexity : O(1)
    private static boolean bruteContainsNearbyDuplicate(int[] nums, int k) {

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j] && Math.abs(i-j)<=k) return true;
            }
        }

     return false;
    }
    // Time Complexity :O(n) for traversing
    // Space Complexity : O(n) for storing preexisted values
    private static boolean optimalContainsNearbyDuplicate(int[] nums, int k){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            if(!map.isEmpty() && map.containsKey(nums[i]) ) return true;
            if(map.size()>k) map.remove(nums[i-k]);
            map.put(nums[i],i);
        }

        return false;
    }
}
