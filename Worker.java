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
public abstract class Worker {
    
    public abstract boolean takeCall(Call c);
    public abstract void Hangup(Queue q);
}
