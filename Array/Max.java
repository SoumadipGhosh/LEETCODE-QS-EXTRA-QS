

public class Max {
    public static void main(String[] args) {
        int[]arr={12,34,56,1};
        System.out.println(max(arr));
    }
    static int max(int[]arr){
        int MaxVal=arr[0]; // stating max val is 1st element of array ..
        for (int i = 0; i <= arr.length; i++) {
           if(arr[i]>MaxVal){
            MaxVal=arr[i];
           }
            
        }
        return MaxVal;
    }
}
