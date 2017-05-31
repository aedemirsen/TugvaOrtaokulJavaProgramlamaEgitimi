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
public class Test {
    
    public static void main(String[] args) {
        
        //Uygulama_1 sinifimizin bir ornegini olusturduk.
        Uygulama_1 uygulama = new Uygulama_1();


        
        //1.uygulama (sayilari yuze kadar ekrana yazdirmak)
        uygulama.yuzeKadarYazdir();
        
        System.out.println("#########");
        
        //2.uygulama (13 e tam bolunen sayilari bulmak)
        uygulama.onuceTamBolunenler();
        
        System.out.println("#########");
        
        //3.uygulam (sayilari toplamak)
        uygulama.sayilariTopla(5, 7);
        
        System.out.println("#########");
        
        //4.uygulama (sayilari carpmak)
        int sonuc = uygulama.sayilariCarp(3, 2);
        System.out.println(sonuc);
        
        
        
        
        
        
    }
    
    
    
}
