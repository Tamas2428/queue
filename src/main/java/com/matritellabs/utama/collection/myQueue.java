package com.matritellabs.utama.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public abstract class myQueue implements Queue {

    //int vaiable to store maximum capacity of the Queue
    int lengthOfQueue;

    //map collection to store objects
    Map mapOfTheQueue = new HashMap(lengthOfQueue);


    //Constructor
    public myQueue(int inputLength) {
        lengthOfQueue = inputLength;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }
}
