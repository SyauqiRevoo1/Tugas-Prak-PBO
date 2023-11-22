/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas2nilaiterbesar;

/**
 *
 * @author AULIA ROVA
 */
public class Tugas2Nilaiterbesar {

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;
        
        int nilaiTertinggi = (number1 > number2) ? ((number1 > number3) ? number1 : number3) : ((number2 > number3) ? number2 : number3);
        System.out.println("Number 1 = " + number1);
        System.out.println("Number 2 = " + number2);
        System.out.println("Number 3 = " + number3);
        System.out.println("Nilai tertinggi adalah angka = " + nilaiTertinggi);
    }
}
