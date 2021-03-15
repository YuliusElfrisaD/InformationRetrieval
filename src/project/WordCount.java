/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class WordCount {
    private static Scanner input;
    public static void main(String[] args) {
        openFile();
        readRecords();
//        closeFile();
    }
    
    public static void openFile(){
        try{
            input = new Scanner(Paths.get("F:\\SEMESTER 6\\PEMEROLEHAN INFORMASI\\Koleksi\\doc2.txt"));
        }catch(IOException ioEX){
            System.out.println("Error open file");
            System.exit(1);
        }
    }
    
    public static void readRecords(){
        try{
            while(input.hasNext()){
                System.out.println(input.next()+"");
                
            }
        } catch(NoSuchElementException nos){
            System.out.println("File error");
        } catch(IllegalStateException stateEx){
            System.out.println("Error reading file");
        }
    }
    
    public static void closeFile(){
        if (input!=null) {
            input.close();
        }
    }
    
    
    
}
