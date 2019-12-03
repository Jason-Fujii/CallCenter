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
public class Menu {
    public Menu()
    {
        int choice = 0;
        CallCenter cc = new CallCenter();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Call Center");
        while(choice != 3)
        {
            System.out.println("Here are your options:");
            System.out.println("1) Add a caller");
            System.out.println("2) Hang up");
            System.out.println("3) Quit");
            System.out.println("Enter the number of the desired command");
            choice = sc.nextInt();
            if(choice == 1)
                cc.addCall();
            else if(choice == 2)
                cc.Hangup();
            
            System.out.println("");
        }
        System.out.println("You have Quit");
    }
}
