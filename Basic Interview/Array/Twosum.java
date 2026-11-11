import java.util.HashMap;

public class Twosum {
    public static void main(String[] args) {
        int arr[]={4,8,6,3,7};
        int target=15;

        // using brust force

        // for(int i=0;i<arr.length;i++){
        //     for(int j=1;j<arr.length;j++){
        //         if(arr[i]+arr[j]==target){
        //             System.out.println(arr[i]+" "+arr[j]);
                    
        //         }   
        //     }
        // }

        // using hashmap

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int reqirement=target-arr[i];

            if(map.containsKey(reqirement)){
                System.out.println("Index: "+map.get(reqirement)+" "+i);
                return ;
            }
            map.put(arr[i], i);
        }
    }
    
}
