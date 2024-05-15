/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alec
 */
public class Main {

    public static void main (String[] args){
        PremiumUser new1 = new PremiumUser(1232, "Alec", "The New Throne");
        User new2 = new NormalUser(1111, "Godwin", "The Old Throne");
        
        new1.reserveBook();
        new1.DisplayUserDetails();
        
        System.out.println();
        
        new2.DisplayUserDetails();
        
        System.out.println();

        
    }
}
