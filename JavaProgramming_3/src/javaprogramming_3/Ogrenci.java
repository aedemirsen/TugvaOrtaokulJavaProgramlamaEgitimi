/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogramming_3;

/**
 *
 * @author aedemirsen
 */
public class Ogrenci {
    
    String adi,soyadi;
    int numara;
    
    Ogrenci(String adi, String soyadi, int numara){
        this.adi = adi;
        this.soyadi = soyadi;
        this.numara = numara;
    }
    
    void kim(){
        System.out.println(adi + " - " + soyadi + " - " + numara);
    }
    
    public static void main(String[] args) {
        
        Ogrenci ogrenci = new Ogrenci("Ahmet Emre","Demirsen",1453);        
        ogrenci.kim();
        
    }
    
}
