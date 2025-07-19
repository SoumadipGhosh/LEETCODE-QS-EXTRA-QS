import java.util.HashSet;
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            // if already present then mean duplicate ..
            if(set.contains(nums[i])){
                return nums[i];
            }

            // add no..
            set.add(nums[i]);
        }
        return -1;
    }
}