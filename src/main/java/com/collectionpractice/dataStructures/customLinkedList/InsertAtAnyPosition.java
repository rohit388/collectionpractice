package com.collectionpractice.dataStructures.customLinkedList;

import java.util.Scanner;

class Node1 {
    int data;
    Node1 next;

    Node1(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedListPosition{
    Node1 head;

    void insertAtAnyPosition(int data,int position){
       Node1 newNode = new Node1(data); //yeha pe ek new node hai jisko add krna head ke sath

        //Case 1:Insert at beginning (for empty , non empty)
        if(head==null || position==1){
//            newNode.next = head;
            head = newNode;
            return;
        }

        Node1 temp = head;
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
        Node1 temp = head;
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
