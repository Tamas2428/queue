package com.matritellabs.utama.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;

public abstract class myQueue implements Queue {

    //int vaiable to store maximum capacity of the Queue
    int lengthOfQueue;
    int numberOfObjects = 0;

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
            //numberOfObjects+1 - we start from zero, and every added element will have previous element key +1 as key
            mapOfTheQueue.put(numberOfObjects+1, o);
            //to keep track the number of the objects in the Queue
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
        if(numberOfObjects == 0) {
            throw new NoSuchElementException();
        } else {
            return mapOfTheQueue.get(1);
        }
    }

    /**
     * Inserts the specified element into this queue if it is possible to do so immediately without
     violating capacity restrictions.
     * @param o
     * @return true upon success, false otherwise
     */
    @Override
    public boolean offer(Object o) {
        if(numberOfObjects < lengthOfQueue) {
            mapOfTheQueue.put(numberOfObjects+1, o);
            numberOfObjects++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retrieves and removes the head of this queue.
     * @return NoSuchElementException if this queue is empty
     */
    @Override
    public Object remove() {
        if(numberOfObjects != 0) {
            Object tempObject = mapOfTheQueue.get(1);
            for(int i = 2; i < lengthOfQueue; i++) {
                mapOfTheQueue.put(i-1, mapOfTheQueue.get(i));
            }
            numberOfObjects--;
            return tempObject;
        } else {
            throw new NoSuchElementException();
        }
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
