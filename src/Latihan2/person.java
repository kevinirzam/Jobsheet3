/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author WINDOWS 10
 */
public class person {
    private String name;
    private int usia;
    
    //Konstruktor
    public person(String name,int usia){
        this.name=name;
        this.usia=usia;
    }
    //Metode
    public void info(){
        System.out.println("Nama : "+this.name);
        System.out.println("Usia : "+this.usia);
    }
}
