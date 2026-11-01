// package Yash Technology.Strings;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String str1="Pravesh";
        String str2="shevarp";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        boolean isanagram=true;

        if(str1.length()!=str2.length()){
            isanagram=false;
            return;
        }else{
            char arr1[]=str1.toCharArray();
            char arr2[]=str2.toCharArray();


            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(!Arrays.equals(arr1, arr2)){
                isanagram=false;
                return;
            }
        }

        if(isanagram){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
