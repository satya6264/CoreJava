package com.vidvaan.string;

import java.io.BufferedReader;  
import java.io.FileReader;  
  
public class CountWordFile  
{  
    public static void main(String[] args) throws Exception {  
        String line;  
        int count = 0;  
  
        FileReader file = new FileReader("src/com/vidvaan/string/String ");  
        BufferedReader br = new BufferedReader(file);  
  
        while((line = br.readLine()) != null) {  
            String words[] = line.split("");  
            count = count + words.length;  
  
        }  
  
        System.out.println("Number of words present in given file: " + count);  
        br.close();  
    }  
}  
