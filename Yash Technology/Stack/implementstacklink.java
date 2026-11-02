// package Yash Technology.Stack;

public class implementstacklink {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    Node top=null;

    void push(int data){
        Node newnode=new Node(data);

        newnode.next=top;
        top=newnode;

        System.out.println(data+" Inserted");

    }

    void pop(){
        if(top==null){
            System.out.println("Stack is Empty..");
            return;
        }
        System.out.println(top.data+" deleted.");
        top=top.next;
    }

    void peek(){
        if(top==null){
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Peek element: "+top.data);

    }

    void print(){
        if(top==null){
            System.out.println("Stack is empty");
            return;
        }

        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        implementstacklink stack=new implementstacklink();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.print();
    }
}
