/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan1_inheritance;

/**
 *
 * Created By_22343075_Syauqi revo mardian
 */
public class RodaEmpat extends Kendaraan {
    double NaikHargaKe = 0;// 1 kali
    void hargaAkhir() {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah Di Modifikasi, Harga Mobil Menjadi Rp. "
                            + hargaDasar);
    }
}
