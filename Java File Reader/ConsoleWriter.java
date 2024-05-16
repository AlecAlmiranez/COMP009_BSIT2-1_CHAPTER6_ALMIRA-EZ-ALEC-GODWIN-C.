/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopmidterms;

import java.io.IOException;

/**
 *
 * @author Alec
 */
public class ConsoleWriter extends FileReader{
      
    void writeName(){
        FileReader test = new FileReader();
        test.readLinebyLine();
        System.out.println(test.Name);
    }
    void writeKeyword(){
        FileReader test = new FileReader();
        test.readLinebyLine();
        System.out.println(test.Keyword);
    }
    void writeAnswer(){
        FileReader test = new FileReader();
        test.readLinebyLine();
        System.out.println(test.Answer);
    }
    public static void main(String[] args) throws IOException{
        ConsoleWriter CWrite = new ConsoleWriter();
        CWrite.writeName();
        CWrite.writeKeyword();
        CWrite.writeAnswer();
        
        InputFile Imno = new InputFile();
        Imno.CreateImno();
    }
}
