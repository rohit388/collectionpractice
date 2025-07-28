package com.collectionpractice.collection.arraylist.linkedList;

import java.util.LinkedList;

public class CreateLinkedList {

    public static void main(String[]args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1); list.add(2); list.add(3);list.add(4);list.add(5);

        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        LinkedList<String> city = new LinkedList<>();
        city.add("Noida"); city.add("Delhi"); city.add("Gurugram"); city.add("pune");city.add("Hyderabad");

        System.out.println(city);
        String thirdCity = city.get(2);
        System.out.println("ThirdCity: "+thirdCity);


    }
}
