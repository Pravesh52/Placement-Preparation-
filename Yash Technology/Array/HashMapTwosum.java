// package Yash Technology.Array;

import java.util.HashMap;

public class HashMapTwosum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];

            if(map.containsKey(complement)){
                System.out.println("Index: "+map.get(complement)+" "+i);
                return;
            }

            map.put(arr[i], i);
        }
    }
}
