package com.collectionpractice.dataStructures.customLinkedList;

import com.collectionpractice.dataStructures.customLinkedList.saperateNode.Node;

class LinkedListPosition{
    Node head;

    void insertAtAnyPosition(int data,int position){
       Node newNode = new Node(data); //yeha pe ek new node hai jisko add krna head ke sath

        //Case 1:Insert at beginning (for empty , non empty)
        if(head==null || position==1){
//            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int count = 1;
        while(temp!=null && count < position-1){
            temp = temp.next;
            count++;
        }
        if(temp==null){
            System.out.println("Invalid position: ");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        //Case 2:
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }

}
public class InsertAtAnyPosition {
    public static void main(String[] args) {
        LinkedListPosition list = new LinkedListPosition();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the position: ");
//        int position = sc.nextInt();
//        System.out.println("Enter the value: ");
//        int value = sc.nextInt();

        list.insertAtAnyPosition(20,1);
        list.insertAtAnyPosition(30,2);
        list.insertAtAnyPosition(40,3);
        System.out.println("After inserting at position:");
        list.display();


    }

}
