// package Yash Technology.Array;

public class Missing {
    public static void main(String[] args) {
        int arr[]={1,6,2,3,4};
        int n=arr.length;

        int expectedsum=(n*(n+1))/2;
        int actualsum=0;

        for(int i=0;i<n;i++){
            actualsum+=i;
        }

        int result=expectedsum-actualsum;

        System.out.println(result);
    }
}
