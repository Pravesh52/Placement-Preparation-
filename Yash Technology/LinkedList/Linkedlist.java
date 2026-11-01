// package Yash Technology.LinkedList;

public class Linkedlist {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // create a linkedlist
    Node head;
    void createlinkedlist(int data){
        Node newnNode=new Node(data);
        head=newnNode;
    }

    void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }

        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    void reverse(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        Node prev=null;
        Node curr=head;

        while(curr!=null){
            Node next=curr.next;

            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

    }


    void findmiddle(){
        if(head==null){
            System.out.println("List is empty.");
            return;
        }
        
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        System.out.println("Middle element: "+slow.data);
        
    }

    boolean detectcycle(){
        if(head==null){
            return false;
        }

        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
            
        }
        return false;
    }

    void print(){
        if(head==null){
            System.out.println("List is empty..");
            return;
        }

        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Linkedlist list=new Linkedlist();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.print();
        list.reverse();
        list.print();
        list.findmiddle();
        
        
    }
}
