/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.in;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Data {
        public final String outlook;
        public final String temperature;
        public final String humidity;
        public final String windy;
        public final String play;

        public Data(String outlook, String temperature, String humidity, String windy, String play) {
            this.outlook = outlook;
            this.temperature = temperature;
            this.humidity = humidity;
            this.windy = windy;
            this.play = play;
        }
    
    public static void main(String[] args) {
        try {
            FileInputStream fstream = new FileInputStream("courses.txt");
            // use DataInputStream to read binary NOT text
            // DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            List<Data> courses = new LinkedList<Data>();
            while ((strLine = br.readLine()) != null) {
                String[] splitOut = strLine.split(",");
                if (splitOut.length == 5) {
                    courses.add(new Data(splitOut[0], splitOut[1], splitOut[2]), splitOut[3], splitOut[4]);
                } else {
                    System.out.println("Invalid class: " + strLine);
                }
            }
            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    
}


//    public String outlook;
//    public String temperature;
//    public String humidity;
//    public String windy;
//    public String play;
//    private static class Structure {
//        public String data;
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        String allDataString;
//        FileInputStream fileReader = new FileInputStream("E:\\KULIAH\\SEMESTER 6\\PENAMBANGAN DATA\\data.txt");
//        DataInputStream in = new DataInputStream(fileReader);
//        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(in));
//        String[] arrayString = {"OUTLOOK", "TEMPERATURE", "HUMIDITY", "WINDY", "PLAY"};
//        int recordNumber = 0;
//
//        Structure[] structure = new Structure[15];
//
//        for (int i = 0; i < 10; i++) {
//            structure[i] = new Structure();
//        }
//
//        while ((allDataString = bufferReader.readLine()) != null) {
//            String[] splitOut = allDataString.split(",");
//            structure[recordNumber].data = "";
//            for (int i = 0; i < arrayString.length; i++) {
//                structure[recordNumber].data += arrayString[i] + splitOut[i];
//            }
//            recordNumber++;
//        }
//
//        bufferReader.close();
//
//        for (int i = 0; i < recordNumber; i++) {
//            System.out.println(structure[i].data);
//
//        }
//    }

