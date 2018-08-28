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
public class Peminjaman extends Buku {
    
    public String kodeTempat;
    public String nomorTempat;
    public int LamaSewa;
    public void setLamaSewa(int lamaSewa){
        LamaSewa =lamaSewa;
    }
    
    public int getLamaSewa(){
        return LamaSewa;
    }
    
    
    public String getKodeTempat(){
        return kodeTempat;
    }
    
    public String getNomerTempat(){
        return nomorTempat;
    }
    
    public String tempatBuku(){
        switch (getJenisInput()){
            case 1 : kodeTempat="A";
            break;
            case 2 : kodeTempat="B";
            break;
            case 3 : kodeTempat="C";}
            return kodeTempat;}
            
    public void tempatNoBuku(){    
        switch (getNamaBuku()){
            case 1 : System.out.print("1");
            break;
            case 2 : System.out.print("2");
            break;
            case 3 : System.out.print("3");
            }}
}
