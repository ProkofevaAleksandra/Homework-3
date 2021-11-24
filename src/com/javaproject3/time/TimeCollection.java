package com.javaproject3.time;

import com.javaproject3.MyLinkedList;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class TimeCollection {
    public static void main(String[] args) {
        //MyList
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        LinkedList<Integer> linkedList0 = new LinkedList<>();
        for (int i = 0; i < 30000; i++) {
            myLinkedList.add(i);
            linkedList0.add(i);
        }
        System.out.println("Comparison MyLinkedList and LinkedList");
        System.out.println("MyLinkedList add:" + myAddTime(myLinkedList));
        System.out.println("LinkedList add:" + addTime(linkedList0));
        System.out.println("MyLinkedList add2:" + myAddTime2(myLinkedList));
        System.out.println("LinkedList add2:" + addTime2(linkedList0));
        System.out.println("MyLinkedList remove:" + myRemoveTime(myLinkedList));
        System.out.println("LinkedList remove:" + removeTime(linkedList0));

        //List
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 30000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        System.out.println("Comparison ArrayList and LinkedList");
        System.out.println("ArrayList add:" + addTime(arrayList));
        System.out.println("LinkedList add:" + addTime(linkedList));
        System.out.println("ArrayList add2:" + addTime2(arrayList));
        System.out.println("LinkedList add2:" + addTime2(linkedList));
        System.out.println("ArrayList remove:" + removeTime(arrayList));
        System.out.println("LinkedList remove:" + removeTime(linkedList));

        //Set
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 10000; i++) {
            hashSet.add(i);
            linkedHashSet.add(i);
            treeSet.add(i);
        }
        System.out.println("Comparison HashSet and LinkedHashSet and TreeSet");
        System.out.println("HashSet add:" + addTimeSet(hashSet));
        System.out.println("LinkedHashSet add:" + addTimeSet(linkedHashSet));
        System.out.println("TreeSet add:" + addTimeSet(treeSet));
        System.out.println("HashSet index:" + containsTimeSet(hashSet));
        System.out.println("LinkedHashSet index:" + containsTimeSet(linkedHashSet));
        System.out.println("TreeSet index:" + containsTimeSet(treeSet));
        System.out.println("HashSet remove:" + removeTimeSet(hashSet));
        System.out.println("LinkedHashSet remove:" + removeTimeSet(linkedHashSet));
        System.out.println("TreeSet remove:" + removeTimeSet(treeSet));

        //Map
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < 10000; i++) {
            hashMap.put(i, i);
            linkedHashMap.put(i, i);
            treeMap.put(i, i);
        }
        System.out.println("Comparison HashMap and LinkedHashMap and TreeMap");
        System.out.println("HashMap add:" + putTimeMap(hashMap));
        System.out.println("LinkedHashMap add:" + putTimeMap(linkedHashMap));
        System.out.println("TreeMap add:" + putTimeMap(treeMap));
        System.out.println("HashMap index:" + containsTimeMap(hashMap));
        System.out.println("LinkedHashMap index:" + containsTimeMap(linkedHashMap));
        System.out.println("TreeMap index:" + containsTimeMap(treeMap));
        System.out.println("HashMap remove:" + removeTimeMap(hashMap));
        System.out.println("LinkedHashMap remove:" + removeTimeMap(linkedHashMap));
        System.out.println("TreeMap remove:" + removeTimeMap(treeMap));


    }

    //MyList collection
    public static long myAddTime(MyLinkedList<Integer> myLinkedList) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int index = 1; index < 30000; index++) {
            myLinkedList.add(index);
        }
        long finishTime = System.currentTimeMillis();
        return (finishTime - startTime);
    }

    public static long myAddTime2(MyLinkedList<Integer> myLinkedList) {
        long startTime = System.currentTimeMillis();
        for (int index = 1; index < 30000; index++) {
            myLinkedList.add(500, 2);
            myLinkedList.add(1550, 5);
            myLinkedList.add(10450, 5);
            myLinkedList.add(20450, 5);
        }
        return (System.currentTimeMillis() - startTime);
    }

    public static long myRemoveTime(MyLinkedList<Integer> myLinkedList) {
        long startTime = System.currentTimeMillis();
        for (int index = 0; index < 30000; index++) {
            myLinkedList.remove(index);
        }
        return (System.currentTimeMillis() - startTime);
    }

    //List collection
    public static long addTime(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int index = 1; index < 30000; index++) {
            list.add(index);
        }
        return (System.currentTimeMillis() - startTime);
    }

    public static long addTime2(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int index = 1; index < 30000; index++) {
            list.add(500, 2);
            list.add(1550, 5);
            list.add(10450, 5);
            list.add(20450, 5);
        }
        return (System.currentTimeMillis() - startTime);
    }

    public static long removeTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int index = 0; index < 30000; index++) {
            list.remove(list);
        }
        return (System.currentTimeMillis() - startTime);
    }

    //Set collection
    public static long addTimeSet(Set<Integer> set) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (Integer index : set) {
            set.add(index);
        }
        return (System.currentTimeMillis() - startTime);
    }

    public static long containsTimeSet(Set<Integer> set) {
        long startTime = System.currentTimeMillis();
        for (int index = 0; index < 10000; index++) {
            set.contains(5000);
            set.contains(2500);
            set.contains(1500);
        }
        return (System.currentTimeMillis() - startTime);
    }

    public static long removeTimeSet(Set<Integer> set) {
        long startTime = System.currentTimeMillis();
        for (int index = 0; index < 10000; index++) {
            set.remove(index);
        }
        return (System.currentTimeMillis() - startTime);
    }

    //Map collection
    public static long putTimeMap(Map<Integer, Integer> map) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int index = 1; index < 10000; index++) {
            map.put(index, random.nextInt());
        }
        return (System.currentTimeMillis() - startTime);
    }

    public static long containsTimeMap(Map<Integer, Integer> map) {
        long startTime = System.currentTimeMillis();
        for (int index = 0; index < 10000; index++) {
            map.containsKey(5000);
            map.containsKey(2500);
            map.containsKey(1500);
        }
        return (System.currentTimeMillis() - startTime);
    }

    public static long removeTimeMap(Map<Integer, Integer> map) {
        long startTime = System.currentTimeMillis();
        for (int index = 0; index < 10000; index++) {
            map.remove(index);
        }
        return (System.currentTimeMillis() - startTime);
    }
}



