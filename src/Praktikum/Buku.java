/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author WINDOWS 10
 */
public class Buku {
    public int inputJenisBuku;
    public int inputNamaBuku;
    
    public void setJenisInput(int Jbuku){
        inputJenisBuku=Jbuku;
    }
    public int getJenisInput(){
        return inputJenisBuku;
    } 
    public void setNamaBuku(int Nbuku){
     inputNamaBuku=Nbuku;   
    }
    public int getNamaBuku(){
        return inputNamaBuku;
    } 
    
    public void tampilBuku(){
    System.out.println("Pilih Jenis Buku : ");
    System.out.println("1. Sains ");
    System.out.println("2. Biografi ");
    System.out.println("3. Sci-fi ");
    System.out.print("Input : ");}
    
    public void judulBukuSains(){
    System.out.println("Pilih Buku : ");
    System.out.println("1. Kimia ");
    System.out.println("2. Biologi ");
    System.out.println("3. Kimia ");
    System.out.print("Input : ");}
    
    public void judulBukuBiografi(){
    System.out.println("Pilih Buku : ");
    System.out.println("1. Biografi Gus Dur");
    System.out.println("2. Biografi B.J Habibie");
    System.out.println("3. Biografi Hasyim Muzadi");
    System.out.print("Input : ");}
    
    public void judulBukuSciFi(){
    System.out.println("Pilih Buku : ");
    System.out.println("1. All good things");
    System.out.println("2. Titanfall");
    System.out.println("3. Interstelar");
    System.out.print("Input : ");}
    
    public void BukuSains(){
        switch(getNamaBuku()){
            case 1: System.out.println(" Kimia ");
            break;
            case 2:System.out.println(" Biologi ");
            break;
            case 3:System.out.println(" Kimia ");}}
    
    public void BukuBiografi(){
        switch(getNamaBuku()){
            case 1: System.out.println(" Biografi Gus Dur");
            break;
            case 2: System.out.println(" Biografi B.J Habibie");
            break;
            case 3:System.out.println(" Biografi Hasyim Muzadi");}}
    
    public void BukuSciFi(){
        switch(getNamaBuku()){
            case 1: System.out.println(" All good things");
            break;
            case 2: System.out.println(" Titanfall");
            break;
            case 3:System.out.println(" Interstelar");}
        }
    }
