public class Reverse {
    public static void main(String[] args) {
        
        int reversed = 0;

        while (x!=0){
            int digit = x%10;
            if(reversed>Integer.MAX_VALUE/10 || reversed<Integer.MIN_VALUE/10){
                return 0;
            }
            reversed = reversed*10 + digit;
            x=x/10; // to remove 12..
        }
        return reversed;
    }
}
    
