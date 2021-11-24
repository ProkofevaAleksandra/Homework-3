package com.javaproject3;

public class Node<E> {
    E element;
    Node<E> next;
    Node<E> prev;

    public Node(E element, Node<E> next, Node<E> prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}
