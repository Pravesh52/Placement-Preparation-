// package DSA.Stack;

import java.util.Stack;

public class Minstack {
    Stack<Integer>stack=new Stack<>();
    Stack<Integer>minstack=new Stack<>();

    void push(int x){
        stack.push(x);

        if(minstack.isEmpty() || x<=minstack.peek()){
            minstack.push(x);
        }
    }

    void pop(){
        if(stack.peek().equals(minstack.peek())){
           minstack.pop();
        }
        stack.pop();
    }

    int top(){
       return stack.peek();
    }

    int getmin(){
        return minstack.peek();
    }


    public static void main(String[] args) {

        Minstack m=new Minstack();

        m.push(-2);
        m.push(0);
        m.push(-3);

        System.out.println(m.getmin());
        m.pop();

        System.out.println(m.top());
        System.out.println(m.getmin());
    }
}
