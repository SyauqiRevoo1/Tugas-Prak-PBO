/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasbufferedreader;

/**
 *
 * @author AULIA ROVA
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TugasBufferedReader {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        //Minta pengguna memasukan tiga nilai ujian
        System.out.print("Masukkan nilai ujian ke-1 =  ");
        double nilai1 = Double.parseDouble(reader.readLine());
        
        System.out.print("Masukkan nilai ujian ke-2 = ");
        double nilai2 = Double.parseDouble(reader.readLine());
        
        System.out.print("Masukkan nilai ujian ke-3 = ");
        double nilai3 = Double.parseDouble(reader.readLine());
        
        //Hitung nilai rata-rata
        double rataRata = (nilai1 + nilai2 + nilai3) / 3;
        
        //Tampilkan hasil dan smiley face atau sad face
        if (rataRata >= 60){
            System.out.println("Rata-rata nilai: " + rataRata + " :-)");
        }else {
            System.out.println("Rata-rata nilai: " + rataRata + ":-(");
        }
    }
}
