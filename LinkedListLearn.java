public class LinkedListLearn {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head=null;

    public void add(int data){
        Node newNode=new Node(data);
    }
}
