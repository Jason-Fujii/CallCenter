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
public class Node {
    Object item;
    Node next;
    
    public Node()
    {
        item = "John Doe";
        next = null;
    }
    
    public Node(Object o, Node n)
    {
        item = o;
        next = n;
    }
    
    public Node(Object o)
    {
        item = o;
        next = null;
    }
    
    @Override
    public String toString()
    {
        String s = "Name: " +item+ " Next: " + next;
        return s;
    }
}