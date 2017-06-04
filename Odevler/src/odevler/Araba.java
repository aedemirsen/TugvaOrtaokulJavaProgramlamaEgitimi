/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odevler;

/**
 *
 * @author aedemirsen
 */
public class Araba {
    
    final String renk; 
    final int sonHiz = 180;
    String marka,model;
    double tekerlekCapi,yukseklik;
    int hiz,silindirSayisi,tekerlekSayisi;
    
    
    //1.constructor
    Araba(){
        renk = "kirmizi";
    }
    
    int hiziArtir(int h){
        hiz += h;
        return hiz;
    }
    
    public static void main(String[] args) {
        
        Araba araba1 = new Araba();
        
        araba1.hiz = 100;
        araba1.marka = "Toyota";
        araba1.model = "Corolla";
        araba1.silindirSayisi = 4;
        
        Araba araba2 = new Araba();
        
        araba2.hiz = 130;
        araba2.marka = "Tofas";
        araba2.model = "SLX";
        araba2.silindirSayisi = 6;
        
        Araba araba3 = new Araba();
        
        araba3.hiz = 90;
        araba3.marka = "Volkswagen";
        araba3.model = "Passat";
        araba3.silindirSayisi = 5;
        
        int a =  araba1.hiz; 
        int b =  araba2.hiz;
        int c =  araba3.hiz;
        int max = 0;
        
        if (a > b && a > c) {
            max = a;
        }
        else if (b > c && b > a) {
            max = b;
        }
        else if (c > a && c > b) {
            max = c;
        }
        
        System.out.println(araba1.renk);
    
    }
    
    
    
}
