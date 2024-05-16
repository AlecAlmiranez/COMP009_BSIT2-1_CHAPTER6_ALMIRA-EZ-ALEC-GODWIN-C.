/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopmidterms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alec
 */
public class InputFile {
    void CreateImno() throws IOException{
    File Imno = new File("Imno Ng PUP.txt");
    Imno.createNewFile();
        try (FileWriter ImnoW = new FileWriter("Imno Ng PUP.txt")) {
            ImnoW.write("Sintang Paaralan, Tanglaw ka ng bayan\n" + "Pandayan ng isip ng kabataan \n" + "Kami'y dumating nang salat sa yaman \n" + "Hanap na dunong ang iyong alay \n" + "Ang layunin mong makatao \n" + "Dinarangal ng Pilipino \n" + "Ang iyong aral, diwa, adhikang taglay \n" + "PUP aming gabay \n" + " Paaralang dakila \n" + " PUP pinagpala \n" + "Gagamitin ang karunungan \n " + "Mula sa'yo, para sa bayan\n" + "Ang iyong aral,diwa, adhikang taglay \n" + "PUP aming gabay\n" + "Paaralang dakila\n" + "PUP pinagpala \n");
        }
    }
}
