package jds.datastructures.linkedlist;

public class MainLinkedList {
    public static void main( String[] args ) {
        LinkedList linkedList = new LinkedList( 4 );

        linkedList.printHead();
        linkedList.printTail();
        linkedList.printLength();

        linkedList.printList();
    }
}