/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alec
 */
public class User {
    int userID;
    String name;
    String borrowedBook;
    
    User(int userID, String name, String borrowedBook) {
    this.userID = userID;
    this.name = name;
    this.borrowedBook = borrowedBook;
    }
    
    void DisplayUserDetails(){
        System.out.println("User ID: " + userID);
        System.out.println("Username: " + name);
        System.out.println("Book borrowed: " + borrowedBook);
    }
}
