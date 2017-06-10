/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev_2;

/**
 *
 * @author aedemirsen
 */
public class Rehber {
    
    String [] numaralar;
    String [] isimler;
    int kapasite;
    int index;
    
    public Rehber(int kapasite){
        index = 0;  //BAŞLANGIÇTA DİZİ İNDEX İMİZ 0, ÇÜNKÜ DİZİ BOŞ
        this.kapasite = kapasite;
        numaralar = new String[this.kapasite];
        isimler = new String[this.kapasite];
    }
    
    void kisiEkle(String telNo,String isim){
        numaralar[this.index] = telNo; //REHBERİMİZDE NUMARALARI SAKLAYAN DİZİYE EKLEME YAPTIK
        isimler[this.index] = isim;  //REHBERİMİZDE İSİMLERİ SAKLAYAN DİZİYE EKLEME YAPTIK
        index++;     
        /*EKLEME İŞLEMİNDEN SONRA DİZİNİN BİR SONRAKİ BOŞLUĞUNA KONUMLANMAK İÇİN İNDEX İ 1 ARTTIRDIK.
        HER EKLEME İŞLEMİ SONUNDA İNDEX 1 ARTACAK ÇÜNKÜ REHBERE YENİ BİR KAYIT EKLENİYOR. */   
    }
    
}
