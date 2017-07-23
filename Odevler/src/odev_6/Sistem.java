/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev_6;

import java.util.ArrayList;

/**
 *
 * @author aedemirsen
 */
public class Sistem {
    
    ArrayList<Uye> uyeler;
    
    Sistem(){
        uyeler = new ArrayList<>();
    }
    
    public void uyeEkle(Uye uye){
        uyeler.add(uye);
    }
    
    public int getKayitSayisi(){
        return this.uyeler.size();
    }
    
    public void bütünUyeleriSil(){
        uyeler.clear();
        for (int i = 0; i < uyeler.size(); i++) {
            uyeler.remove(i);
        }
    }
    
    public void uyelerinTelefonNumaralariniDegistir(String s){    
        for (Uye uye : uyeler) {
            uye.setTelNo(s);
        }
    }
    
    public static void main(String[] args) {
                
        String s = "asd".toString();
        
        
    }
    
}
