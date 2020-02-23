/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openprogram;

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import javax.swing.JFileChooser;

public class OpenProgram {
    
     public static String klasorSec(){
        JFileChooser jFileChooser = new JFileChooser(); // Nesnemizi oluşturduk
        jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);// burada  directory(klasör) seçebileceğimiz belirttik
        jFileChooser.showOpenDialog(null); // Dialog penceresinin açılmasını sağladık
        try {
             return jFileChooser.getSelectedFile().getAbsolutePath();   // seçilen klasörün yolunu aldık. Seçim yapmadıysak catche düşecektir.
        } catch (Exception e) {
            return null; // Eğer seçim yapamadıysak buraya düşer ve null değerini alır
        }
             
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String klasorYolu = OpenProgram.klasorSec();
        
            String hd = klasorYolu+"\\A_HardDisk_Sentinel\\AA_HDSentinel.exe"; 
            String heaven = klasorYolu+"\\A_Heaven_Benchmark_4.0"; 
            String BatteryCare = klasorYolu+"\\BatteryCare\\BatteryCare.exe"; 
            String Player = "C:\\Program Files (x86)\\Windows Media Player\\wmplayer.exe"; 
            String BlueScreenView = klasorYolu+"\\BlueScreenView\\BlueScreenView.exe"; 
            String keyboardtest = klasorYolu+"\\keyboardtest.exe"; 
            String WebcamViewer = klasorYolu+"\\WebcamViewer.exe"; 
            String music = klasorYolu+"\\MUSİC\\music.mp3"; 
        
        
        Runtime runtime = Runtime.getRuntime(); 
        
       
       
        try
        {
         
             // Running the above command 
            Runtime run  = Runtime.getRuntime(); 
            Process bh = run.exec(hd); 
            Process ba = run.exec(BatteryCare); 
            Process blue = run.exec(BlueScreenView);
            Process k = run.exec(keyboardtest);
            Process web = run.exec(WebcamViewer);
            
            Runtime.getRuntime().exec("cmd /c start " +heaven);
               
            ProcessBuilder builder = new ProcessBuilder(Player, music);
            builder.start();


        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }
    
}
