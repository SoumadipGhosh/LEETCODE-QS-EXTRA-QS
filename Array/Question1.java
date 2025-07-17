class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int n=nums.length;

        // logic 1 : if arr[i]>arr[i+1] then count ++..
        // logic 2 : if count>1 the false ..

        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){ // % n beacuse we do circular comparison ..
                count++; 

            }
            if(count>1){
                return false;
            }

        }
        return true ;

    }
}