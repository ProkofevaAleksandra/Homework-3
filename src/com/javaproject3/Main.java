package com.javaproject3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 3!");
        MyLinkedList<Integer> inter = new MyLinkedList<>();
        inter.add(3);
        inter.add(5);
        inter.add(2, 2);
        inter.add(1, 9);
        inter.add(4, 4);
        System.out.println("MyLinkedList: " + inter.toString());
        System.out.println("Result get(): " + inter.get(0));
        System.out.println("Result indexOf(): " + inter.indexOf(5));
        System.out.println("The size = " + inter.size());

        System.out.println("\nArray of values: ");
        Object[] massInter2 = inter.toArray();
        for (int i = 0; i < massInter2.length; i++) {
            System.out.print(massInter2[i]);
        }

        System.out.println();
        Iterator it = inter.iterator();
        System.out.println("\nThrough an iterator: ");
        while (it.hasNext()){
            System.out.print(it.next());
        }

        System.out.println();
        MyLinkedList<Point> inter5 = new MyLinkedList<>();
        Point point = new Point(2,3);
        Point point2 = new Point(1,3);
        inter5.add(point);
        inter5.add(point2);
        System.out.println("\nFilled with elements Point(): "+ inter5.toString());
        System.out.println("The size = " + inter5.size());
        System.out.println("Result indexOf(): " + inter5.indexOf(point));
    }
}


