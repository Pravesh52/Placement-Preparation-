// package TCS NQT.30 Sets;


// Make a answer Single Digit

import java.util.Scanner;

public class Digitsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        
        while(n>=10){
            int sum=0;

            while(n>0){
                int rem=n%10;
                sum=sum+rem;
                n=n/10;
            }
           n=sum;
        }

        System.out.println(n);



    }
}
