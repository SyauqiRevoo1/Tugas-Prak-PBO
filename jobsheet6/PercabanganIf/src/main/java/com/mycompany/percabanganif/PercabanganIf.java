/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.percabanganif;

/**
 *
 * @author AULIA ROVA
 */
import java.util.Scanner;



public class PercabanganIf {

    public static void main(String[] args) {
        double total_pembelian, diskon = 0;
        
        Scanner dataMasuk = new Scanner (System.in);
        System.out.print("Masukkan Total Pembelian: Rp ");
        total_pembelian = dataMasuk . nextDouble();
        
        if (total_pembelian >= 50000)
            diskon = 0.1 * total_pembelian;
            
        System.out.println("Besarnya diskon : Rp " + diskon);
    }
}
