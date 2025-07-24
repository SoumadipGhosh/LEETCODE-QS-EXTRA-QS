import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        // find all elements that appear more than n/3 times in the array

        int [] nums={1,3,2,5,1,3,1,5,1};
        MajorityElement(nums); // call the function

    }
    public static void MajorityElement(int[]nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        // create key value pair
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){ // if already present ..
                map.put(nums[i],map.get(nums[i])+1); // then increase the count
            }else{
                map.put(nums[i],1);
            }
        }

        // now check for the count
        for(int key:map.keySet()){
            if(map.get(key) > n/3){ // if count is greater than n/3
                System.out.println(key); // print the key
            }
        }
    }

}
