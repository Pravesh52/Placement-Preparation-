public class fibonacci {
    public static void main(String[] args) {
        int n=5;

        int a=0;
        int b=1;

        int sum=0;

        for(int i=1;i<=n;i++){
            System.out.println(a+" ");
            sum=sum+a;
            int c=a+b;
            a=b;
            b=c;

        }
        System.out.println("Sum "+ sum);
    }
}
