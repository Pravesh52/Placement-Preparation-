public class twopointermovezero {
    public static void main(String[] args) {
        int arr[]={1,0,1,1,0,0,1,1};

        int start=0;
        int end=arr.length-1;

        while(start<end){
            if(arr[start]==0 && arr[end]!=0){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;


                start++;
                end--;
            }else if(arr[start]!=0){
                start++;
            }else{
                end--;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
