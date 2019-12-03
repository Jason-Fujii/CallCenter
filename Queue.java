/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project6;

/**
 *
 * @author jasonfujii
 */
public class Queue {
    private Node lastNode;
    private Node prev;
    int size;
    
    public Queue()
    {
        lastNode = null;
        size = 0;
    }
    
    public boolean isEmpty()
    {
        return lastNode == null;
    }
    
    public void dequeueAll()
    {
        lastNode = null;
    }
    
    public void enqueue(Object data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            //newNode.next = newNode;
            lastNode = newNode;
            lastNode.next = lastNode;
            prev = lastNode;
            
        }
        else
        {
            prev = lastNode;
            newNode.next = lastNode.next;
            lastNode.next = newNode;
            lastNode = newNode;
        }
        size++;
    }
    
    public Object dequeue() throws QueueException
    {
        if(isEmpty())
            throw new QueueException("Queue is empty");
        else if(lastNode.next == lastNode)
        {
            Node n = lastNode;
            lastNode = null;
            size--;
            return n.item;
        }
        else
        {
            Node firstNode = lastNode.next;
            lastNode.next = firstNode.next;
            size--;
            return firstNode.item;
        }
    }
    
    public Object dequeueLast() throws QueueException
    {
        if(isEmpty())
            throw new QueueException("Queue is Empty");
        else if(lastNode.next == lastNode)
        {
            Node n = lastNode;
            lastNode = null;
            return n;
        }
        else
        {
            Node temp = lastNode;
            prev.next = lastNode.next;
            lastNode = prev;
            prev = (Node)peekLast();
            return temp;
        }
    }
    
    public Object peekLast() throws QueueException
    {
        if(!isEmpty())
        {
            return lastNode;
        }
        else
            throw new QueueException("Queue is empty");
    }
    
    public Object peek() throws QueueException
    {
        if(!isEmpty())
            return lastNode.next.item;
        else
            throw new QueueException("Queue is empty");
    }
}
