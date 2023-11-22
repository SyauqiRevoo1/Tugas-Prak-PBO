/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugashari;

/**
 *
 * @author AULIA ROVA
 */
public class TugasHari {

    public static void main(String[] args) {
        //deklarasikan array days dengan tipe data string
        String[] days = new String[7];
        //inisialisasikan nilai nilai array days
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";
        
        for (int i = 0; i < days.length; i++){
            System.out.println(days[i]);
        }     
    }
}
