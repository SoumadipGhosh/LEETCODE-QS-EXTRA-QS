class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate =0;

        for(int i=0;i<nums.length;i++){
            if(count==0){ // when coount =0 means not giving any no ..
                candidate=nums[i]; // pick random no ..
            }
            if(nums[i]==candidate){
                count++;
            }
            else{
                count--;
            }
           
        }
        return candidate;
    }
}