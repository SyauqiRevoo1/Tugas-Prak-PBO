/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kondisioperator;

/**
 *
 * @author AULIA ROVA
 */
public class KondisiOperator {

    public static void main(String[] args) {
        String status = "";
        int grade = 50;
        
        //mendapatkan status pelajar
        status = (grade >= 60) ? "Passed" : "fail";
        
        //print status
        System.out.println(status);
    }
}
