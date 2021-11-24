package com.javaproject3;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;

public class MyLinkedList<E> implements ILinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    public MyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public void add(E element) {
        if (element == null) {
            throw new NullPointerException("The first argument is null.");
        }
        if (size != 0) {
            Node<E> prev = last;
            last = new Node<>(element, null, null);
            prev.next = last;
            last.prev = prev;
        } else {
            last = new Node<>(element, null, null);
            first = last;
        }
        size++;
    }

    @Override
    public void add(int index, E element) {
        if (element == null) {
            throw new NullPointerException("The first argument is null.");
        }
        if (index == 0) {
            Node<E> prev = first;
            first = new Node<>(element, null, null);
            prev.prev = first;
            first.next = prev;
        }
        if (index == size) {
            Node<E> next = last;
            last = new Node<>(element, null, null);
            last.prev = next;
            next.next = last;
        }
        if (index < size && index > 0) {
            Node<E> previousNode = getNode(index - 1);
            Node<E> nextNode = getNode(index);
            Node<E> newElement = new Node<>(element, nextNode, previousNode);
            previousNode.next = newElement;
            nextNode.prev = newElement;
        }
        size++;
    }

    @Override
    public void clear() {
        Node<E> next;
        for (Node<E> x = this.first; x != null; x = next) {
            next = x.next;
            x.element = null;
            x.next = null;
            x.prev = null;
        }
        this.first = this.last = null;
        this.size = 0;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.element;
    }

    private Node<E> getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result;
    }

    @Override
    public int indexOf(E element) {
        Node<E> result = first;
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (result.element == element) break;
            result = result.next;
            index++;
        }
        return index;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < size; i++) {
            s.append(get(i));
        }
        return s.toString();
    }

    @Override
    public E remove(int index) {
        Node<E> current = first;
        if (size == 0) {
            throw new IllegalStateException("Empty list.");
        }
        if (index == 0) {
            Node<E> newFirst = first.next;
            first.next.prev = null;
            first.next = null;
            first.element = null;
            first = newFirst;
        }
        if (index + 1 == size) {
            Node<E> newLast = last.prev;
            last.prev.next = null;
            last.prev = null;
            last.element = null;
            last = newLast;
        }
        if (index + 1 < size && index > 0) {
            Node<E> previousNode = getNode(index - 1);
            Node<E> thisNode = getNode(index);
            previousNode.next = thisNode.next;
            thisNode.next.prev = previousNode;
            thisNode.prev = null;
            thisNode.next = null;
            thisNode.element = null;
        }
        size--;
        return current.element;
    }

    @Override
    public E set(int index, E element) {
        Node<E> result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        result.element = element;
        return result.element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[this.size];
        int i = 0;

        for (Node x = this.first; x != null; x = x.next) {
            result[i++] = x.element;
        }
        return result;
    }

    @Override
    public <E> E[] toArray(E[] element) {
        if (element.length < this.size) {
            element = (E[]) Array.newInstance(element.getClass().getComponentType(), this.size);
        }
        int i = 0;
        Object[] result = element;
        for (Node x = this.first; x != null; x = x.next) {
            result[i++] = x.element;
        }
        if (element.length > this.size) {
            element[this.size] = null;
        }
        return element;
    }

    public Iterator<E> iterator() {
        return new MyLinkedListIterator(first);
    }


    private class MyLinkedListIterator implements Iterator<E> {
        private Node<E> thisCurrent;

        MyLinkedListIterator(Node<E> first) {
            this.thisCurrent = first;
        }

        public boolean hasNext() {
            return thisCurrent != null;
        }

        public E next() {
            if (hasNext()) {
                E thisElement = thisCurrent.element;
                thisCurrent = thisCurrent.next;
                return thisElement;
            }
            return null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
