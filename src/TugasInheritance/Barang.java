/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasInheritance;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Barang extends Pembeli{
    public int jml;
    
        String Buku = " A031 ";
        String Pensil = " B092 ";
        String Cutter = " C027 ";
        String Spidol = " D084 ";
        String Pulpen = " E012 ";
        
    public int hargaBuku,hargaPensil,hargaCutter,hargaSpidol,hargaPulpen;
    public int qtyBuku,qtyPensil,qtyCutter,qtySpidol,qtyPulpen;
    public int hargaTotal;
    
    public void tampil(){
        Scanner masuk = new Scanner(System.in);
        showBarang();
        int a = masuk.nextInt();
        showQuantity();
        int b = masuk.nextInt();
        Switch(a,b);
    }
    public void showBarang(){
        
        System.out.println("");
        System.out.println("Pilih Barang Yang Akan Anda Beli : ");
        System.out.println("1.> Buku   ");
        System.out.println("2.> Pensil ");
        System.out.println("3.> Cutter ");
        System.out.println("4.> Spidol ");
        System.out.println("5.> Pulpen ");
        System.out.print("Input : ");
    }
    
    public void showQuantity(){
        System.out.print("Masukkan Jumlah Barang : ");}
    
    public void Switch(int b,int c){
        switch(b){
            case 1: hargaBuku+=4000*c;qtyBuku+=c;hargaTotal+=4000*c;
            break;
            case 2: hargaPensil+=3000*c;qtyPensil+=c;hargaTotal+=3000*c;
            break;
            case 3: hargaCutter+=2000*c;qtyCutter+=c;hargaTotal+=2000*c;
            break;
            case 4: hargaSpidol+=6000*c;qtySpidol+=c;hargaTotal+=6000*c;
            break;
            case 5: hargaPulpen+=3000*c;qtyPulpen+=c;hargaTotal+=3000*c;}}   
        
        public void Lagi(){
        System.out.println(" ");
        System.out.println("Ingin Membeli Lagi ?");
        System.out.println("1.> Ya");
        System.out.println("2.> Tidak");
        System.out.print("Input : ");
        }
        
    public void struck(){
        System.out.println("-------------------------------------------------");
        System.out.println("            Toko Buku Kevin Ganteng              ");
        System.out.println("            Jl.Kapan Nikah Pak No.21             ");
        System.out.println("-------------------------------------------------");
        System.out.println(" Kode | Barang dan Merek     | Qty | Total       ");
        System.out.println(Buku  +"| Buku Tulis Pepsodent |  "+qtyBuku+"  | Rp."+hargaBuku);
        System.out.println(Pensil+"| Pensil Pepsodent     |  "+qtyPensil+"  | Rp."+hargaPensil);
        System.out.println(Cutter+"| Cutter               |  "+qtyCutter+"  | Rp."+hargaCutter);
        System.out.println(Spidol+"| Spidol               |  "+qtySpidol+"  | Rp."+hargaSpidol);
        System.out.println(Pulpen+"| Pulpen               |  "+qtyPulpen+"  | Rp."+hargaPulpen);
        System.out.println("-------------------------------------------------");
        System.out.println("                       Harga Total | Rp."+hargaTotal);
        Data("Sherly","Malang",938,681232231);
        System.out.println("-------------------------------------------------");
    }
        
    
}
