/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasjoption;

/**
 *
 * @author AULIA ROVA
 */
import javax.swing.JOptionPane;

public class TugasJOption {

    public static void main(String[] args) {
       // Minta pengguna memasukkan tiga nilai ujian
        double nilai1 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai ujian ke-1: "));
        double nilai2 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai ujian ke-2: "));
        double nilai3 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai ujian ke-3: "));

        // Hitung nilai rata-rata
        double rataRata = (nilai1 + nilai2 + nilai3) / 3;

        // Tampilkan hasil dan smiley face atau sad face menggunakan JOptionPane
        if (rataRata >= 60) {
            JOptionPane.showMessageDialog(null, "Rata-rata nilai: " + rataRata + " :-)");
        } else {
            JOptionPane.showMessageDialog(null, "Rata-rata nilai: " + rataRata + " :-(");
        }
    }
}