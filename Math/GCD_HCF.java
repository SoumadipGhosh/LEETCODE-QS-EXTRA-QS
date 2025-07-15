import java.util.Scanner;


public class HCF_GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 2 no : ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int g=0; // will store the GCD as you calculate it.



        for (int i = 1; i <= a; i++) {
            if(a%i==0&&b%i==0) //  does i divide both a and b?
            g=i;
        }
        System.out.println("GCD = " + g);
    }
    
    


}