// package Basic Interview.Array;

import java.util.Scanner;

// Reverse an array.

public class Reversearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }

        System.out.println("Reverse Arrays: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]+" ");
        }

    }
}
