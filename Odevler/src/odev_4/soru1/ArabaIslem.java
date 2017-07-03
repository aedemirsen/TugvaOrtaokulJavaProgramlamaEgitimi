/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev_4.soru1;

/**
 *
 * @author aedemirsen
 */
public class ArabaIslem {
    
    
    //1.metod
    double ortalamaBul(Araba [] arabalar){
        double ortalama;
        double toplamHiz = 0;
        for (int i = 0; i < arabalar.length; i++) {
            toplamHiz += (double)arabalar[i].hiz;
        }
        ortalama = toplamHiz / arabalar.length;
        return ortalama;
    }
    
    //2.metod
    Araba [] kirmiziArabalar(Araba [] arabalar){
        Araba [] kirmiziArabalar = new Araba[arabalar.length];
        for (int i = 0; i < arabalar.length; i++) {
            if ("kirmizi".equals(arabalar[i].renk)) {
                kirmiziArabalar[i] = arabalar[i];
            }
        }
        return kirmiziArabalar;
    }
    
    //3.metod
    Araba enHizliArabayiDondur(Araba [] arabalar){
        int maxHiz = arabalar[0].hiz;
        Araba enHizli = null;
        for (int i = 0; i < arabalar.length; i++) {
            if (maxHiz < arabalar[i].hiz ) {
                maxHiz = arabalar[i].hiz;
                enHizli = arabalar[i];
            }
        }
        return enHizli;
    }
    
    //4.metod
    void enHizliAraba(Araba [] arabalar){
        Araba enHizliAraba = enHizliArabayiDondur(arabalar);
        String marka = enHizliAraba.marka;
        String model = enHizliAraba.model;
        System.out.println(marka + " - " + model);
    }
    
    //5.metod
    Araba [] hizlariSirala(Araba [] arabalar) {
        int temp;
        for (int i = 0; i < arabalar.length - 1; i++) {
            for (int j = 0; j < arabalar.length - (i + 1); j++) {
                if (arabalar[j].hiz < arabalar[j + 1].hiz) { 
                    temp = arabalar[j].hiz;
                    arabalar[j] = arabalar[j + 1];
                    arabalar[j + 1].hiz = temp;
                }
            }
        }
        return arabalar;
    }
    
    //6.metod
    void renkAyniMi(Araba [] araba, String renk) {
        for (int i = 0; i < araba.length; i++) 
            if (araba[i].renk.equals(renk)) 
                System.out.println(araba[i].plaka);
    }
}
