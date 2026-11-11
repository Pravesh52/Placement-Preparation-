// find duplicates value

import java.util.HashSet;

public class Hashset {
  public static void main(String[] args) {
     int arr[]={4,5,8,4,3,6};

     HashSet<Integer>set=new HashSet<>();

     for(int i=0;i<arr.length;i++){
        if(set.contains(arr[i])){
            System.out.println("duplicates: "+arr[i]);
        }else{
            set.add(arr[i]);
        }
     }

  }    
}
