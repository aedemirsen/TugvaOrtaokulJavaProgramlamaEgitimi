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
public class Uygulama_1 {
    
    
    //UYGULAMA 1
    void yuzeKadarYazdir(){
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
    
    //UYGULAMA 2
    void onuceTamBolunenler(){
        for (int i = 0; i < 200; i++) {
            if (i % 13 == 0) {
                System.out.println(i);
            }
        }
    }
    
    //UYGULAMA 3
    void sayilariTopla(int sayi1, int sayi2){
        int toplam = sayi1+sayi2;
        System.out.println(toplam);
    }
    
    //UYGULAMA 4
    int sayilariCarp(int sayi1,int sayi2){
        int carpim = sayi1 * sayi2;
        return carpim;
    }
    
    
    
    
    
}
