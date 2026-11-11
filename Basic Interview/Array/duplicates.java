

public class duplicates {
    public static void main(String[] args) {
        int arr[]={4,5,8,4,3,6};

        int duplicates=0;

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    duplicates=arr[i];
                    break;
                }
            }
        }
        System.out.println(duplicates);
    }
}
