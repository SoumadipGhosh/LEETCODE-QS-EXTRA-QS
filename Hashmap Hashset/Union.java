import java.util.*;
public class Union {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5};
        int[]arr2={3,4,5,6,7};
        System.out.println("Union of the two arrays is: " + union(arr1, arr2)); // call the function
    }
    public static int union(int[]arr1,int[]arr2){
        HashSet<Integer>set=new HashSet<>();

        // add all elements of arr1 and arr2 to the set
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        // return the size of the set
        return set.size();
    }
}

// time complexity : 0(n)                       
