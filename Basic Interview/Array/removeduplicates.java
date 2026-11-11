public class removeduplicates {
    public static void main(String[] args) {
        int arr[]={1,5,8,5,4,7,6};

        int ans[]=new int[arr.length];

        int index=0;

       for(int i=0;i<arr.length;i++){
           boolean isfound=false;
           for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    isfound=true;
                    break;
                }
            }
            if(isfound==false){
             ans[index]=arr[i];
             index++;
            }

       }

        for(int i=0;i<index;i++){
            System.out.println(ans[i]);
        }
    }
}
