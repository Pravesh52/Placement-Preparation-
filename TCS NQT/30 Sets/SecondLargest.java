

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={4,8,2,7,3,5};
        int largest=arr[0];
        int SecondLargest=Integer.MIN_VALUE;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                SecondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>SecondLargest && arr[i]!=largest){
                SecondLargest=arr[i];
            }
        }
        System.out.println(SecondLargest);
    }
}
