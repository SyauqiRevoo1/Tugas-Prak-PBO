/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan2_inheritance;

/**
 *
 * Created By_22343075_Syauqi revo mardian
 */
public class Employ extends Person {
    private String noKaryawan;
    
    //konstruktor
    public Employ (String noKaryawan, String name, int age) {
        super(name, age);
        this.noKaryawan = noKaryawan;
    }
    
    //metode
    public void info() {
        System.out.println("No. Karyawan : " + this.noKaryawan);
        super.info();
    }
}
