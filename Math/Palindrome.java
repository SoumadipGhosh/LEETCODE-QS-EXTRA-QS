class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){ // negative never be palindrome no ..
            return false;
        }
        int n=x;
        int reverse =0;

        while(n>0){

            int d=n%10;
            reverse=reverse*10+d;
            n=n/10;
        }
        if(reverse==x){
            return true;
        }
        else{
            return false;
        }
    }
}