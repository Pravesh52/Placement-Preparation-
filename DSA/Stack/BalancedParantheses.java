// package DSA.Stack;

import java.util.Stack;

public class BalancedParantheses {
    public static void main(String[] args) {
        String str="({[]})";

        Stack<Character>stack=new Stack<>();

        boolean balanced=true;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else if(ch==')'|| ch=='}' || ch==']'){
                if(stack.isEmpty()){
                    balanced=false;
                    break;
                }

                char top=stack.pop();

                if((ch==')' && top!='(')
                     ||( ch=='}' && top!='{')
                    ||(ch==']'&& top!='[') ){
                        balanced=false;
                        break;
                }
            }
        }

        if(!stack.isEmpty()){
            balanced=false;
        }

        System.out.println(balanced);
    }
}
