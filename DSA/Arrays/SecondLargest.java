// package DSA.Arrays;

// find the second largest element

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={12, 35, 1, 10, 34, 1};
        int largest=arr[0];
        int SecondLargest=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                SecondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>SecondLargest&& arr[i]!=largest){
                SecondLargest=arr[i];
            }
        }
        
        System.out.println("Largest: "+largest);
        System.out.println("Second Largest: "+SecondLargest);
    }
}
