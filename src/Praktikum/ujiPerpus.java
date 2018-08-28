/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class ujiPerpus extends Peminjaman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String Jenisnya = null;
    Scanner a = new Scanner(System.in);
    Buku ku = new Buku();
    Peminjaman saya = new Peminjaman();
    
        ku.tampilBuku();
        int jenis = a.nextInt();
        ku.setJenisInput(jenis);
        
        switch(ku.getJenisInput()){
            case 1: ku.judulBukuSains();
            break;
            case 2: ku.judulBukuBiografi();
            break;
            case 3: ku.judulBukuSciFi();
        }
        
        
        int nama = a.nextInt();
        ku.setNamaBuku(nama);
        
        System.out.print("Lama Sewa : ");
        int lama = a.nextInt();
        saya.setLamaSewa(lama);
        
        saya.tempatBuku();
        System.out.println("--- Struk Peminjaman Buku ---");
        System.out.print("- Jenis Buku : ");
        
        switch(ku.getJenisInput()){
            case 1: System.out.println("Sains");
            break;
            case 2: System.out.println("Biografi");
            break;
            case 3: System.out.println("Sci-Fi");
        }
        System.out.print("- Nama Buku  : ");
        switch(ku.getJenisInput()){
            case 1: ku.BukuSains();
            break;
            case 2: ku.BukuBiografi();
            break;
            case 3: ku.BukuSciFi();
        }
        
        System.out.println("- Lama Sewa  : "+saya.getLamaSewa()+" Hari");
        saya.tempatBuku();
        System.out.println("- Tempat Buku : "+saya.getKodeTempat());
        
        
        
    }
    
}
