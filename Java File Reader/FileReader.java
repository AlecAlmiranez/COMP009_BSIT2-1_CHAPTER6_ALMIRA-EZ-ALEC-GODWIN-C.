/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopmidterms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alec
 */
public class FileReader extends InputFile {

          Scanner read;
    String Name;
    String Keyword;
    String Answer;
    void readLinebyLine() {
        File target = new File ("InputFile.txt");

        try {
            read = new Scanner(target);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(read.hasNextLine()){
            Name = read.nextLine();
            Keyword = read.nextLine();
            Answer = read.nextLine();
        }
    }
}
