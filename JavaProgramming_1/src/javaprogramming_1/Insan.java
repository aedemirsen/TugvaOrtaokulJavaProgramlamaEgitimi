/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogramming_1;

/**
 *
 * @author aedemirsen
 */
public class Insan {
    
    String isim,soyisim,cinsiyet;
    int yas;
    
    //1.
    Insan(){
        
    }
    //2.
    Insan(String isim, String soyisim, String cinsiyet, int yas){
        this.isim = isim;
        this.soyisim = soyisim;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
    }
    
    void ismiYazdir(){
        System.out.println(isim + " " + soyisim);
    }
    
    int yasiDondur(){
        return yas;
    }
    
    public static void main(String[] args) {
        
        Insan insan1 = new Insan();
        
        Insan insan2 = new Insan("Ahmet Emre", "Demirsen", "erkek", 22);
        
        insan2.ismiYazdir();
        
        System.out.println(insan2.yasiDondur());
      
        
        
    }
    
}
