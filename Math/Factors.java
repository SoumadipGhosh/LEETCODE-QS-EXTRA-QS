import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter a no : ");
        int n=in.nextInt();

        factors1(n);
    }
    public static void factors1(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            // here print both no together..
            if(n%i==0){
                System.out.println(i + " ");
            
            if(i!=n/i){
                System.out.println(n/i);
            }
        }
    }
}
}