// package DSA.Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[]={4, 5, 2, 25};
        int n=arr.length;

       // Output: [5, 25, 25, -1]
       
       Stack<Integer>stack=new Stack<>();

       int result[]=new int[n];

       for(int i=n-1;i>=0;i--){

        while(!stack.isEmpty() && stack.peek()<=arr[i]){
            stack.pop();
        }

        if(stack.isEmpty()){
            result[i]=-1;
        }else{
            result[i]=stack.peek();
        }

        stack.push(arr[i]);

       }

       for(int i=0;i<result.length;i++){
        System.out.println(result[i]+" ");
       }
   }
}
