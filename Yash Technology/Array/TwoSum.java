// package Yash Technology.Array;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={1,8,6,5,3,7,5};
        int target=15;

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" "+arr[j]);
                    break;
                }
            }
        }
    }
}
