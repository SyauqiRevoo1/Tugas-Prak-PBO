/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas2jb8;

/**
 *
 * @author AULIA ROVA
 */
import javax.swing.JOptionPane;
public class Tugas2JB8 {

    public static void main(String[] args) {
        //Deklarasi array untuk menyimpan 10 nomor
        int[] nomor = new int[10];
        
        //Minta input dari user
        for(int i = 0; i < nomor.length; i++){
            nomor[i] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nomor ke- " + (i+1)+ ":"));
        }
        //Temukan nomor terbesar
        int nomorBesar = nomor[0];
        for(int i = 1; i < nomor.length; i++){
            if (nomor[i] > nomorBesar){
                nomorBesar = nomor[i];
            }
        }
        
        //Tampilkan nomor terbesar
        JOptionPane.showInputDialog(null, "Nomor terbesar adalah " + nomorBesar);
    }
}
