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
public class Struk extends Barang{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Barang keluaran = new Barang();
        keluaran.tampil();
        Scanner masuk = new Scanner(System.in);
        keluaran.Lagi();
        int d = masuk.nextInt();
        if(d<=1){
            keluaran.tampil();
        }
        keluaran.struck();       
            
    }
    
}
