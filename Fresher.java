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
public class Fresher extends Worker{
    int callsTaken;
    Call[] call;
    
    public Fresher()
    {
        callsTaken = 0;
        call = new Call[1];
    }
    
    public boolean isEmpty()
    {
        return call[0] == null;
    }
    
    public boolean takeCall(Call newCall)
    {
        if(isEmpty())
        {
            call[0] = newCall;
            System.out.println("The Fresher has taken a call with: " + call[0].name);
            callsTaken++;
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    public void Hangup(Queue q)
    {
        System.out.println("Caller: " + call[0].name + " has finished with the Fresher");
        call[0] = null;
        findCall(q);
    }
    
    public void findCall(Queue q)
    {
        if(!q.isEmpty())
        {
            takeCall((Call)q.dequeue());
        }
    }
}
