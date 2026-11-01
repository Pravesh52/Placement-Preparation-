// package Yash Technology.Array;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={5,7,6,9,8,2,3};
        int larest=arr[0];
        int SecondLargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>larest){
                SecondLargest=larest;
                larest=arr[i];
            }else if(arr[i]!=larest && arr[i]>SecondLargest){
                SecondLargest=arr[i];
            }
        }
        System.out.println(SecondLargest);
    }
}
