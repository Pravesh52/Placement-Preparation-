// package AMCAT;

import java.util.Scanner;

public class Question1 {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array: ");
      int inputsize=sc.nextInt();

      int inputarr[]=new int[inputsize];

      for(int i=0;i<inputsize;i++){
         inputarr[i]=sc.nextInt();
      }

      int answer[]=new int[inputarr.length];
      int index=0;

      for(int i=0;i<inputarr.length;i++){
         if(inputarr[i]%2==0){
            answer[index]=inputarr[i];
            index++;
         }
      }

      for(int i=0;i<inputarr.length;i++){
         if(inputarr[i]%2!=0){
            answer[index]=inputarr[i];
            index++;
         }
      }

      System.out.println("answer: ");
      
      for(int i=0;i<answer.length;i++){
         System.out.println(answer[i]);
      }

      
      
   }
}
