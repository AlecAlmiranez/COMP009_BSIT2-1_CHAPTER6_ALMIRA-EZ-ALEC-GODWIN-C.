/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alec
 */

import java.util.Scanner;

public class NormalUser extends User {
    
        String book;
    
    public NormalUser(int userID, String name, String borrowedBook) {
        super(userID, name, borrowedBook);
    }
    
    public void BorrowBook(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Book: ");
        book = s.nextLine();
        System.out.println("Book borrowed: " + book);
        if(!borrowedBook.isBlank())
        {
        borrowedBook = book;
        }
        else
        {
            System.out.println("There is already a book borrowed!");
        }
    }
    
    public void ReturnBook(){
        System.out.println("Book returned: " + book);
        borrowedBook = " ";
    }
}
