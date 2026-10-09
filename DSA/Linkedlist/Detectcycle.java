// package DSA.Linkedlist;

public class Detectcycle {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head;

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

    boolean hasCycle(){
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
    public static void main(String[] args) {
        Detectcycle list=new Detectcycle();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.head.next.next.next.next = list.head.next;

        System.out.println(list.hasCycle());
    }
}
