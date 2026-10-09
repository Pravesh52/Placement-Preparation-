// package DSA.Linkedlist;

public class Reverse {
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

    void reverse(){
        if(head==null){
            System.out.println("list is empty..");
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

    void print(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Reverse list=new Reverse();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.print();

        list.reverse();

        list.print();
    }
}
