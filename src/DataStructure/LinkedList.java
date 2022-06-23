package DataStructure;

public class LinkedList {
    Node head;

    public void insertAtHead(int data){
        Node newNode= new Node(data);
        newNode.setNextNode(head);
        head=newNode;
    }
}
