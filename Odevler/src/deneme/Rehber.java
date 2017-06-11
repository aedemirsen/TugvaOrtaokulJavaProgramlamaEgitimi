/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme;

/**
 *
 * @author aedemirsen
 */
public class Rehber {
    
    String numaralar [];
    String isimler [];
    int kapasite;
    int index;
    
    Rehber(int kapasite){
        this.index = 0;
        this.kapasite = kapasite;
        numaralar = new String[kapasite];
        isimler = new String[kapasite];
    }
    
    void kisiEkle(String isim, String telNo){
        numaralar[index] = telNo;
        isimler[index] = isim;
        index++;
    }
    
    
    
}
