import java.util.*;


public class QueueUsingLinkedList {

    private Node front, rear;
    private int currentSize; // number of items

    // class to define linked node
    private class Node {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    // Zero argument constructor
        public QueueUsingLinkedList()
         {
         front = null;
         rear = null;
         currentSize = 0;
         }

    public boolean isEmpty() {
        return (currentSize == 0);
    }

     // Add data to the end of the list.
     public void enqueue(int data) {
        Node oldRear = rear;
        rear = new Node(data);
        
        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
        currentSize++;
        System.out.println(data + " added to the queue");
    }


    // Remove item from the beginning of the list.
    public int dequeue() {

        if(front==null)
        return -1;
        
        int data = front.data;
        front = front.next;
        if (isEmpty()) {
            rear = null;
        }
        currentSize--;
        System.out.println(data + " removed from the queue");
        return data;
    }

   
}