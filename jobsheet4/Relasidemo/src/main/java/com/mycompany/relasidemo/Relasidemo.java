/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relasidemo;

/**
 *
 * @author AULIA ROVA
 */
public class Relasidemo {

    public static void main(String[] args) {
        int i = 37;
        int j = 42;
        int k = 42;
        
        System.out.println("Nilai variabel...");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        
        //lebih besar dari
        System.out.println("Lebih besar dari...");
        System.out.println("i > j = " +(i > j)); //false
        System.out.println("j > i = " +(j > i)); //true
        System.out.println("k > j = " +(k > j)); //false
        
        //lebih besar atau sama dengan
        System.out.println("Lebih besar atau sama dengan...");
        System.out.println("i >= j = " +(i >= j));
        System.out.println("j >= i = " +(j >= i));
        System.out.println("k >= j = " +(k >= j));
        
        //lebih kecil dari
        System.out.println("Lebih kecil dari...");
        System.out.println("i < j = " +(i < j));
        System.out.println("j < i = " +(j < i));
        System.out.println("k < j = " +(k < j));
        
        //lebih kecil atau sama dengan
        System.out.println("Lebih kecil atau sama dengan...");
        System.out.println("i <= j = " +(i <= j));
        System.out.println("j <= i = " +(j <= i));
        System.out.println("k <= j = " +(k <= j));
        
        //sama dengan
        System.out.println("Sama dengan...");
        System.out.println("i == j = " +(i == j));
        System.out.println("j == i = " +(j == i));
        System.out.println("k == j = " +(k == j));
        
        //tidak sama dengan
        System.out.println("Tidak sama dengan...");
        System.out.println("i != j = " +(i != j));
        System.out.println("j != i = " +(j != i));
        System.out.println("k != j = " +(k != j));
        
        
    }
}
