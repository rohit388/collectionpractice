package com.collectionpractice.dataStructures.customLinkedList;
import java.util.Scanner;

class Node{
    int data;
    Node1 next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class CustomLinkedList{
    Node1 head; //start with head
    public void insert(int data){

        Node1 newNode = new Node1(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node1 temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void insertAtBeginning(int data){
        Node1 newNode = new Node1(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data){
        Node1 newNode = new Node1(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node1 temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display(){
        Node1 temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}


public class CreateLinkedListInsertTraverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size linkedList : ");
        int element = sc.nextInt();

        System.out.println("Now enter the values: ");
        CustomLinkedList list = new CustomLinkedList();
        int values = 0;
        for(int i=1;i<=element;i++){
             values = sc.nextInt();
            list.insert(values);
        }

        System.out.println("Before inserting at beginning:");
        list.display();

        System.out.println("Insert the value for the beginning position: ");
        values = sc.nextInt();
        list.insertAtBeginning(values);

        System.out.println("After inserting at beginning:");
        list.display();

        System.out.println("Insert the value for the End position: ");
        values = sc.nextInt();
        list.insertAtEnd(values);

        System.out.println("After inserting at End:");
        list.display();
    }
}
