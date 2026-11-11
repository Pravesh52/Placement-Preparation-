
public class Missing {
    public static void main(String[] args) {
       int arr[]={1,5,4,3,6};
       int n=arr.length+1;
       
       int Missingformula=n*(n+1)/2;
       int sum=0;

       for(int i=0;i<arr.length;i++){
          sum=sum+arr[i];
       }

       int missing=Missingformula-sum;

       System.out.println(missing);


    }
}
