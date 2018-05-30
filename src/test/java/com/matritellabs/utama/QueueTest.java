package com.matritellabs.utama;

import com.matritellabs.utama.collection.Queue;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class QueueTest {

    Queue queue;

    /*
     * boolean add(Object e) Inserts the specified element into this queue if it is possible to do so immediately
       without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.

       Object   element() Retrieves, but does not remove, the head of this queue. Throws: NoSuchElementException - if this queue is empty

       boolean offer(Object e) Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
Object   peek() Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
Object   poll() Retrieves and removes the head of this queue, or returns null if this queue is empty.
Object   remove() Retrieves and removes the head of this queue. Throws: NoSuchElementException - if this queue is empty
     */
    @Before
    public void init() {
        // Init queue here
    }

    @Test
    public void addAddsElement() {
        queue.add(new Object());
    }

    @Test
    public void addAcceptsNull() {
        queue.add(null);
        assertNull(queue.element());
    }

    @Test(expected = IllegalStateException.class)
    public void addThrowsExceptionIfCapacityIsViolated() {
        fail("Don't know how to create Queue with capacity yet, Create with capacity 5");
        for (int i = 0; i < 5; i++) {
            queue.add(new Object());
        }
        // This should cause the exception since capacity is 5 and a 6th element is added
        queue.add(new Object());
    }

    @Test
    public void offerReturnsFalseIfCapacityIsViolated() {
        fail("Don't know how to create Queue with capacity yet, Create with capacity 5");
        for (int i = 0; i < 5; i++) {
            queue.offer(new Object());
        }
        assertFalse(queue.offer(new Object()));
    }

    @Test(expected = NoSuchElementException.class)
    public void elementThrowsNoSuchElementExceptionIfCalledOnEmptyQueue() {
        queue.element();
    }

    @Test(expected = NoSuchElementException.class)
    public void removeThrowsNoSuchElementExceptionIfCalledMoreTimesThanElementsAdded() {
        queue.add(new Object());
        queue.add(new Object());
        queue.remove();
        queue.remove();
        queue.remove();
    }

    @Test
    public void pollReturnsNullIfCalledMoreTimesThanElementsAdded() {
        queue.add(new Object());
        queue.add(new Object());
        queue.remove();
        queue.remove();
        assertNull(queue.remove());
    }

    @Test
    public void peekReturnsNullIfCalledOnEmptyQueue() {
        assertNull(queue.peek());
    }

    @Test
    public void elementReturnsTheFirsElementAddedSingleElement() {
        Object e = new Object();
        queue.add(e);
        assertSame(e, queue.element());
    }

    @Test
    public void elementReturnsTheFirsElementMultipleTimes() {
        Object e1 = new Object();
        Object e2 = new Object();
        Object e3 = new Object();
        Object e4 = new Object();
        Object e5 = new Object();
        queue.add(e1);
        queue.add(e2);
        queue.add(e3);
        queue.add(e4);
        queue.add(e5);
        assertSame(e1, queue.element());
        assertSame(e1, queue.element());
        assertSame(e1, queue.element());
        assertSame(e1, queue.element());
        assertSame(e1, queue.element());
    }

    @Test
    public void peekReturnsTheFirsElementMultipleTimes() {
        Object e1 = new Object();
        Object e2 = new Object();
        Object e3 = new Object();
        Object e4 = new Object();
        Object e5 = new Object();
        queue.add(e1);
        queue.add(e2);
        queue.add(e3);
        queue.add(e4);
        queue.add(e5);
        assertSame(e1, queue.peek());
        assertSame(e1, queue.peek());
        assertSame(e1, queue.peek());
        assertSame(e1, queue.peek());
        assertSame(e1, queue.peek());
    }


    @Test
    public void removeReturnsTheElementsInFIFOOrder() {
        Object e1 = new Object();
        Object e2 = new Object();
        Object e3 = new Object();
        Object e4 = new Object();
        Object e5 = new Object();
        queue.add(e1);
        queue.add(e2);
        queue.add(e3);
        queue.add(e4);
        queue.add(e5);
        assertSame(e1, queue.remove());
        assertSame(e2, queue.remove());
        assertSame(e3, queue.remove());
        assertSame(e4, queue.remove());
        assertSame(e5, queue.remove());
    }

    @Test
    public void pollReturnsTheElementsInFIFOOrder() {
        Object e1 = new Object();
        Object e2 = new Object();
        Object e3 = new Object();
        Object e4 = new Object();
        Object e5 = new Object();
        queue.add(e1);
        queue.add(e2);
        queue.add(e3);
        queue.add(e4);
        queue.add(e5);
        assertSame(e1, queue.poll());
        assertSame(e2, queue.poll());
        assertSame(e3, queue.poll());
        assertSame(e4, queue.poll());
        assertSame(e5, queue.poll());
    }

    @Test
    public void removeReturnsTheFirsElementAddedSameElementMultipleTimes() {
        Object e1 = new Object();
        queue.add(e1);
        queue.add(e1);
        queue.add(e1);
        assertSame(e1, queue.element());
        assertSame(e1, queue.element());
        assertSame(e1, queue.element());
    }
}
