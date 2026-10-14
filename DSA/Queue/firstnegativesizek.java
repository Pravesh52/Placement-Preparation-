// package DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class firstnegativesizek {
    public static void main(String[] args) {
        int arr[]={12, -1, -7, 8, -15, 30, 16, 28};
        int k=3;

        Queue<Integer>q=new LinkedList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                q.add(i);
            }

            if(!q.isEmpty()&&q.peek()<=arr[i]){
                q.remove();
            }
            if(i>=k-1){
                if(!q.isEmpty()){
                    System.out.println(arr[q.peek()]+" ");
                }else{
                    System.out.println("0 ");
                }
            }
        }
    }

}
