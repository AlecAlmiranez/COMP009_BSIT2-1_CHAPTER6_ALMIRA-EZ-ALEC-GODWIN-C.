/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alec
 */
import java.util.Scanner;

public class PremiumUser extends NormalUser {
    
    String reservedBook;
    
        PremiumUser(int userID, String name, String borrowedBook){
            super(userID,name,borrowedBook);
        }
        
        void reserveBook(){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter which book to reserve: ");
            reservedBook = s.nextLine();
            System.out.println("Reserved Book:  " + reservedBook);
        }
        
        void DisplayUserDetails(){
            super.DisplayUserDetails();
            System.out.println("Reserved Book: " + reservedBook);
        }
}
