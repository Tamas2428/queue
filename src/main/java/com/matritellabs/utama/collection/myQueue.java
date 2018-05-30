package com.matritellabs.utama.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;

public abstract class myQueue implements Queue {

    //int vaiable to store maximum capacity of the Queue
    int lengthOfQueue;
    int numberOfObjects = 1;

    //map collection to store objects
    Map mapOfTheQueue = new HashMap(lengthOfQueue);


    //Constructor
    public myQueue(int inputLength) {
        lengthOfQueue = inputLength;
    }

    /**
     * Inserts the specified element into this queue if it is possible to do so immediately without violating
     capacity restrictions.
     * @param o
     * @return true upon success, and throwing an IllegalStateException if no space is currently available.
     */
    @Override
    public boolean add(Object o) {
        if(numberOfObjects < lengthOfQueue) {
            mapOfTheQueue.put(numberOfObjects, o);
            numberOfObjects++;
            return true;
        } else {
            throw new IllegalStateException();
        }
    }


    /**
     * Retrieves, but does not remove, the head of this queue.
     * @return NoSuchElementException if this queue is empty
     */
    @Override
    public Object element() {
        if(numberOfObjects == 1) {
            throw new NoSuchElementException();
        } else {
            return mapOfTheQueue.get(1);
        }
    }

    /**
     * Inserts the specified element into this queue if it is possible to do so immediately without
     violating capacity restrictions.
     * @param o
     * @return true upon success
     */
    @Override
    public boolean offer(Object o) {
        if(numberOfObjects < lengthOfQueue) {
            mapOfTheQueue.put(numberOfObjects+1, o);
            return true;
        } else {
            return false;
        }
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
    public Object peek() {
        return null;
    }
}
