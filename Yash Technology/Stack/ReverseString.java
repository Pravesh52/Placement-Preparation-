// package Yash Technology.Stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str="Pravesh";
        Stack<Character>stack=new Stack<>();

        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }

        String reverse="";

        while(!stack.isEmpty()){
            reverse=reverse+stack.pop();
        }

        System.out.println("Original: "+str);
        System.out.println("Reverse: "+reverse);
    }
}
