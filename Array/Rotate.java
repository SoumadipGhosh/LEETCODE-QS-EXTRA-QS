class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n; // in case k is larger than n ..

        // here basically do 3 steps ..

        // 1st - rotate the whole array ..

        int start =0 , end = n-1;
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
             start++;
             end--;
        }
        // rotate 1st k part ..

         start =0 ;
         end = k-1;
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
             start++;
             end--;
        }
        // rotate remaing part..

         start =k;
         end = n-1;
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
             start++;
             end--;
        }

    }
}