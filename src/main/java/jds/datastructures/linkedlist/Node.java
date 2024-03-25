package jds.datastructures.linkedlist;

public class Node {
    private int value;
    private Node next;

    Node(int value){
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public Node getNext()
    {
        return next;
    }

    void setNext( final Node node )
    {
        this.next = node;
    }
}
