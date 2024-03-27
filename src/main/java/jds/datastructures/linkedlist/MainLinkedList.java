package jds.datastructures.linkedlist;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);

        linkedList.append(2);


        System.out.println(linkedList.removeLast().getValue());
        System.out.println(linkedList.removeLast().getValue());
        System.out.println(linkedList.removeLast());
    }
}
