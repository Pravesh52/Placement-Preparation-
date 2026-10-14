public class MoveZeroEnd {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        int countzero=0;

        int result[]=new int[arr.length];
        int index=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]=='0'){
                countzero++;
            }

            if(arr[i]!=0){
                result[index]=arr[i];
                index++;
            }
        }

        if(index<arr.length){
            result[index]=countzero;
            index++;
        }

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
