public class removeduplicates {
    public static void main(String[] args) {
        int arr[]={1,8,5,6,7,5};

        int result[]=new int[arr.length];
        int index=0;

        for(int i=0;i<arr.length;i++){
            boolean found=false;
            for(int j=0;j<index;j++){
                if(arr[i]==result[j]){
                   found=true;
                   break;
                }
            }
            if(found==false){
                result[index]=arr[i];
                index++;
            }
        }

        for(int i=0;i<index;i++){
            System.out.println(result[i]+" ");
        }
    }
}
