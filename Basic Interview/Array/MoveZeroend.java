

public class MoveZeroend {
  public static void main(String[] args) {
    int arr[]={1,0,1,1,0,0,1,1};

    int ans[]=new int[arr.length];
    int index=0;


    for(int i=0;i<arr.length;i++){
       

        if(arr[i]!=0){
            ans[index]=arr[i];
            index++;
        }
    }

    if(arr.length>index){
        ans[index]=0;
        index++;
    }

    for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");
    }
  }    
}
