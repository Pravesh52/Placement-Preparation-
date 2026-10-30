import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        boolean ArmStrong=false;

        // count number

        int count=0;
        int temp=n;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        // System.out.println(count);

        int result=0;
         temp=n;
        while(temp>0){
            int rem=temp%10;
            int digitpower=1;

            for(int i=0;i<count;i++){

                digitpower=digitpower*rem;
            }
            result+=digitpower;
            temp=temp/10;
        }

        if(result==n){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }


    }
}
