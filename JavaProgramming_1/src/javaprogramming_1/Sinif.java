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
public class Sinif {
    
    String sinifAdi;
    double sinifAlani;
    int pencereSayisi;    
    int malzemeSayisi;
    int kapiSayisi;
    String duvarRengi;
    int kapasite;
    double tavanYuksekligi;
    int askiSayisi;
    String masalarinCinsi;
    
    void ismiDegistir(String yeniIsim){
        sinifAdi = yeniIsim;
    }
    
    String ismiGetir(){
        return sinifAdi;
    }
    
    void duvarRengiDegistir(String yeniRenk){
        duvarRengi = yeniRenk;
    }
    
    public static void main(String[] args) {
      //  System.out.println("Ahmet Emre Demirşen");        
        Sinif sinif = new Sinif();   
        
        
        
        sinif.sinifAdi = "B121";        
        
        
        sinif.ismiDegistir("B100");        
        
        System.out.println(sinif.ismiGetir());
       // String isim = sinif.sinifAdi;        
        //System.out.println(sinif.sinifAdi);
        
        
        sinif.duvarRengi = "Mavi";         
        sinif.duvarRengiDegistir("Beyaz");
       // System.out.println(sinif.duvarRengi);
    }
    
    
    
    
    
    
    
    
    
}


