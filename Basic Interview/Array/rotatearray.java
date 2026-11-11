

public class rotatearray {
    static void reverse(int arr[],int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;

        // output: 7,6,5,1,2,3,4
        int n=arr.length;

        k=k%n;
       

        // all array reverse

        reverse(arr, 0,n-1);

        // k element tak reverse

        reverse(arr, 0, k-1);


        // reverse remaining element

        reverse(arr, k, n-1);


        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        


    }    
}
