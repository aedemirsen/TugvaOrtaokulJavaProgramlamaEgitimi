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
    
    String marka,model,renk,plakaNo;
    int hiz,kapiSayisi;
    boolean sporMu;
    double agirlik;
    
    public Araba(){
        renk = "Kırmızı";
    }
    
    int hiziArtir(int hiz){
        this.hiz += hiz;
        return this.hiz;
    }
    
    public static void main(String[] args) {
        
        Araba araba1 = new Araba();
        Araba araba2 = new Araba();
        Araba araba3 = new Araba();
        
        //HIZ ATAMALARI
        araba1.hiz = 180;
        araba2.hiz = 280;
        araba3.hiz = 220;
        
        //MARKA ATAMALARI
        araba1.marka = "BMW";
        araba2.marka = "Honda";
        araba3.marka = "Mercedes";
        
        //HIZ KONTROLU
        int hizAraba1 = araba1.hiz;
        int hizAraba2 = araba2.hiz;
        int hizAraba3 = araba3.hiz;
        
        if (hizAraba1 > hizAraba2) {
            if (hizAraba1 > hizAraba3) {
                System.out.println("en hızlı 1.araba");
            }
            else{
                System.out.println("en hızlı 3.araba");
            }
        }
        else{
            if (hizAraba2 > hizAraba3) {
                System.out.println("en hizli 2.araba");
            }
            else{
                System.out.println("en hızlı 3.araba");
            }
        }
        
        
    }
    
    
}
