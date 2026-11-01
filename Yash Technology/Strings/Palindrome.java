// package Yash Technology.Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();

        int left=0;
        int right=str.length()-1;
        boolean ispalindrome=true;


        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                ispalindrome=false;
                return;
            }
            left++;
            right--;
        }
        if(ispalindrome){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
