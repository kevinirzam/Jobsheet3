/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasInheritance;

/**
 *
 * @author WINDOWS 10
 */
public class Pembeli{
    public String nama_pembeli,alamat;
    public int id_pembeli;
    public long no_telp;
    
    public void Data(String nama_pembeli,String alamat,int id_pembeli,long no_telp){
        this.nama_pembeli=nama_pembeli;
        this.alamat=alamat;
        this.id_pembeli=id_pembeli;
        this.no_telp=no_telp;
        dataPembeli();
    }
    
    public void dataPembeli(){
        System.out.println("Id Pembeli     : "+this.id_pembeli);
        System.out.println("Nama Pembeli   : "+this.nama_pembeli);
        System.out.println("Alamat Pembeli : "+this.alamat);
        System.out.println("No.Telp        : "+this.no_telp);
    }
}
