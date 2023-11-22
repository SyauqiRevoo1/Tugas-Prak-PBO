/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.scanner1;

/**
 *
 * @author AULIA ROVA
 */
import java.util.Scanner;
public class Scanner1 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print ("Masukkan nama lengkap : ");
        String nama = in.nextLine();
        
        System.out.print ("Masukkan NIM : ");
        int NIM = in.nextInt();
        
        System.out.print ("Masukkan nilai : ");
        float nilai = in.nextFloat();
        
        
        System.out.println("\nNama  : " + nama +
                           "\nNIM   : " + NIM + 
                           "\nNilai : " + nilai);
    }
}
