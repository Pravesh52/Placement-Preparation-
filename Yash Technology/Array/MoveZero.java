// package Yash Technology.Array;

public class MoveZero {
    public static void main(String[] args) {
        int arr[]={0,5,7,0,6,3,4};

        
        int result[]=new int[arr.length];
        int index=0;

        for(int i=0;i<arr.length;i++){
    

            if(arr[i]!=0){
                result[index]=arr[i];
                index++;
            }
        }

        if(index<arr.length){
            result[index]=0;
            index++;
        }

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
