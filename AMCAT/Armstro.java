import java.util.Scanner;

public class Armstro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int temp=n;
        int digitcount=0;

        while(temp>0){
            digitcount++;
            temp=temp/10;
        }

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
            System.out.println("ArmStrong number.");
        }else{
            System.out.println("Not a armstrong");
        }
    }
}
