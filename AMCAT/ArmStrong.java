import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
   
    //    count the digit

    int temp=n;

        int digitcount=0;

        while(temp>0){
            digitcount++;
            temp=temp/10;
        }
        // System.out.println(digitcount);

        // int power=digitcount;

        // ab her ek digit pe power lagani hai 

          temp=n;
          int sum=0;

        while(temp>0){
            int rem=temp%10;

            int power=1;

            for(int i=1;i<=digitcount;i++){
                power=power*rem;
            }

           sum=sum+power;

            temp=temp/10;

        }

        if(sum==n){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not a Armstrong");
        }
    }    
}
