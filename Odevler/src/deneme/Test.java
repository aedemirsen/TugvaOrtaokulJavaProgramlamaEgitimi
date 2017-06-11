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
public class Test {
    
    
    public static void main(String[] args) {
        
        Rehber rehber = new Rehber(100);
        
        rehber.kisiEkle("Mehmed Emin Basturk", "6654879112");
        rehber.kisiEkle("Eray Aslan", "477811155");
        rehber.kisiEkle("Kerem Yazici", "78754554545");
        
        String isimler [] = rehber.isimler;
        String numaralar [] = rehber.numaralar;
        
        for (int i = 0; i < isimler.length; i++) {
            System.out.println(isimler[i]);
        }
        
        
        System.out.println("2. soru");
        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i] == "Eray Aslan") {
                System.out.println(numaralar[i]);
            }
        }
        
        
    }
    
}
