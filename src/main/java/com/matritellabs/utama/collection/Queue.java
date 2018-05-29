package com.matritellabs.utama.collection;

public interface Queue {

    /**
     * Inserts the specified element into this queue if it is possible to do so
     immediately without violating capacity restrictions, returning true upon success
     and throwing an IllegalStateException if no space is currently available.
     * @param e
     * @return true when it is allowed to add element to the Queue, otherwise false
     */
    boolean add(Object e);


    /**
     * Retrieves, but does not remove, the head of this queue.
     * @return the next element from the Queue
     */
    Object element();


    /**
     * Inserts the specified element into this queue if it is possible to do so
     immediately without violating capacity restrictions.
     * @param e
     * @return true when it is allowed to add element to the Queue, otherwise false
     */
    boolean offer(Object e);


    /**
     * Retrieves, but does not remove, the head of this queue, or returns null if this
     queue is empty.
     * @return the next element from the Queue, or null if the Queue is empty
     */
    Object peek();


    /**
     * Retrieves and removes the head of this queue, or returns null if this queue is empty.
     */
    Object poll();


    /**
     * Retrieves and removes the head of this queue.
     */
    Object remove();

}
