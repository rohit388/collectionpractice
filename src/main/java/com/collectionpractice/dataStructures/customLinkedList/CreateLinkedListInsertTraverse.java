package com.collectionpractice.dataStructures.customLinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

}
class CustomLinkedList{

    Node head;// start for the list

    void insert(int data) {

        Node newNode = new Node(data);
        // check if list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;


    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }


}

public class CreateLinkedListInsertTraverse {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();
    }
}
