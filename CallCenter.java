/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project6;
import java.util.*;
/**
 *
 * @author jasonfujii
 */
public class CallCenter {
    public Queue q = new Queue();
    public Fresher f = new Fresher();
    public TL tl = new TL();
    public Manager m = new Manager();
    
    public void addCall()
    {
        Scanner sc = new Scanner(System.in);
        String name, number;
        System.out.println("Please enter the customer's name");
        name = sc.nextLine();
        System.out.println("Please enter the customer's number");
        number = sc.nextLine();
        Call newCall = new Call(name, number);
        
        if(f.isEmpty())
            f.takeCall(newCall);
        else if(tl.isEmpty())
            tl.takeCall(newCall);
        else if(m.isEmpty())
            m.takeCall(newCall);
        else
        {
            q.enqueue(newCall);
            System.out.println("Caller: " + newCall.name + " has been placed on hold.");
            System.out.println("There are " + q.size + " callers ahead of " + newCall.name);
        }
    }
    
    public void Hangup() throws QueueException
    {
        //hang up the fresher first
        //hang up the TL next
        //hang up the Manager next
        //if no one has a person, hang up from the queue
        if(!f.isEmpty())
        {
            f.Hangup(q);
        }
        else if(!tl.isEmpty())
            tl.Hangup(q);
        else if(!m.isEmpty())
            m.Hangup(q);
        else if(!q.isEmpty())
        {
            Call c = (Call)q.dequeue();
            System.out.println("Caller: " + c.name + " has hung up and has left the queue");
        }
        else
            System.out.println("There are no callers in the queue");
    }
}
