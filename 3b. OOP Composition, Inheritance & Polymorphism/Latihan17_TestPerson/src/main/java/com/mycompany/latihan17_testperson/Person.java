/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan17_testperson;

/**
 *
 * Created By_22343075_Syauqi revo mardian
 */
public class Person {
    // private instance variables
    private String name, address;

    /** Constructs a Person instance with the given name and address */
    public Person(String name, String address) {
       this.name = name;
       this.address = address;
    }

    // Getters and Setters
    /** Returns the name */
    public String getName() {
       return name;
    }
    /** Returns the address */
    public String getAddress() {
       return address;
    }
    /** Sets the address */
    public void setAddress(String address) {
       this.address = address;
    }

    /** Returns a self-descriptive string */
    @Override
    public String toString() {
       return name + "(" + address + ")";
    }
}