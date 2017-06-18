/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev_3;

/**
 *
 * @author aedemirsen
 */
public class Hayvan {

    int ayakSayisi;
    boolean kuyrukVarMi;
    double kilo;
    String renk;
    String cins;
    int hiz;
    String neObur;
    double iskembeBuyuklugu;
    boolean kanatliMi;
    double kuyrukUzunlugu;
    int kilSayisi;
    boolean evcilMi;
    int IQ;
    String dini;
    double dayaniklilik;
    String aile;
    String tur;
    
    Hayvan(String tur, String cins) {
        this.tur = tur;
        this.cins = cins;
    }
    
    Hayvan(){
        
    }
    
    void sesCikar(){
        System.out.println("Bu hayvan bilinmiyor.");
    }
    
    String getTur(){
        return tur;
    }
    
    String getCins(){
        return cins;
    }
    
    boolean kuyruk(){
        boolean b = false;
        if (kuyrukVarMi == true) {
            b = true; 
        }
        return b;
    }

}