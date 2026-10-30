import java.util.Scanner;

public class Primenumberrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // first of input the value where print value
        int n=sc.nextInt();   
        
        for(int i=2;i<=n;i++){
            boolean isprime=true;

            for(int j=2;j<=i/2;j++){

                if(i%j==0){
                    isprime=false;
                    break;
                }
            }

            if(isprime){
                System.out.println(i);
            }
        }
    }
}
