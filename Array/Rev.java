import java.util.Arrays;

public class Rev {
    public static void main(String[] args) {
        int[]arr={23,34,56,78,89,12};

        reverse(arr);

        System.out.println("Reversed array is : " + Arrays.toString(arr));
    }
    public static void reverse(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){ // when sarting index less than end index ..
            // swap ..
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start ++;
            end--;
        

        }
    }
}
