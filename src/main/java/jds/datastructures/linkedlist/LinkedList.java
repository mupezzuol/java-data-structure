package jds.datastructures.linkedlist;

public class LinkedList
{
    private Node head; // the head of list, the first item
    private Node tail; // the tail of list, the last item
    private int length; // the size of list

    public LinkedList(int value){
        Node newNode = new Node( value );
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value){
        Node newNode = new Node( value );
        // Empty List
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode); // Setting new node in the tail
            tail = newNode; // Pointer to the last item
        }
        length++;
    }

    public void printList(){
        Node temp = head;
        while ( temp != null ){
            System.out.println("Node: " + temp.getValue());
            temp = temp.getNext();
        }
    }

    public Node getHead()
    {
        return head;
    }

    public Node getTail()
    {
        return tail;
    }

    public int getLength()
    {
        return length;
    }

    public void printHead()
    {
        System.out.println("Head: "+head.getValue());
    }

    public void printTail()
    {
        System.out.println("Tail: "+tail.getValue());
    }

    public void printLength()
    {
        System.out.println("Length: "+length);
    }
}
