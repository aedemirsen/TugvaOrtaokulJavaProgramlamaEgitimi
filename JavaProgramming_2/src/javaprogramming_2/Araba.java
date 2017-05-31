/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogramming_2;

/**
 *
 * @author aedemirsen
 */
public class Araba {
    
    String renk;
    String marka;
    int hiz;
    
    //1.constructor
    Araba(String r){
        renk = r;
    }
    
    //2.constructor
    Araba(){
        
    }
    
    //3.constructor
    Araba(String r,String m,int h){
        renk = r;
        marka = m;
        hiz = h;
    }
    
    void rengiDegistir(String r){
        renk = r;
    }
    
    public static void main(String[] args) {
        
        Araba araba1 = new Araba("Kirmizi");
        
        araba1.rengiDegistir("Mavi");
        
        Araba yusufunArabasi = new Araba("Gri", "Ferrari", 400);
        
        System.out.println("yusufun arabasinin ozellikleri = "+yusufunArabasi.renk+"-"+yusufunArabasi.marka+"-"+yusufunArabasi.hiz);
        
       
    }
    
    
    
    
    
    
    
}
