/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author WINDOWS 10
 */
public class gajah extends hewan{
    public static void testClassMethod(){
        System.out.println("The class method in Hewan...");
    }
    //Meng-overide method pada classs animale
    public void testInstanceMethod(){
        System.out.println("The instance method in gajah...");
    }
    
    public static void main(String[] adad){
        gajah myGajah = new gajah();
        hewan myHewan = myGajah;
        hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
