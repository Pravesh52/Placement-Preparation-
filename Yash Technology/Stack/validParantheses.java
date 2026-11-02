// package Yash Technology.Stack;

import java.util.Stack;

public class validParantheses {
    public static void main(String[] args) {
        String str="{}[]()";

        Stack<Character>stack=new Stack<>();
        boolean isvalid=true;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='['||ch=='('||ch=='{'){
                stack.push(ch);
            }
            else if(stack.isEmpty()){
                isvalid=false;
                return;
            }else{
                char top=stack.pop();

                if(ch=='}' && top!='{' || ch==']' && top!='[' || ch=='(' && top!=')'){
                    isvalid=false;
                    return;
                }
            }
        }
        if(isvalid){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
