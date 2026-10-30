import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<num;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
    }
}
