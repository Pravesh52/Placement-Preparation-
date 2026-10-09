public class FindMiddle {
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



    

    void FindMiddle(){
        if(head==null){
            System.out.println("list is empty..");
            return;
        }
       

        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }

        if(slow!=null){
            System.out.println("Middle node: "+slow.data);
        }


    }
    public static void main(String[] args) {
        FindMiddle list=new FindMiddle();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.FindMiddle();

      }
}
