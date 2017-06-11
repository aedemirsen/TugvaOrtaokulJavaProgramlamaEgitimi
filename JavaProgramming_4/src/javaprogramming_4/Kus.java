/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogramming_4;

/**
 *
 * @author aedemirsen
 */
public class Kus extends Hayvan{
    
    String gagaTuru;
    double kanatAcikligi;
    boolean ucabiliyorMu;
    
    Kus(){
        
    }
    
    Kus(String tur, String cins) {
        super(tur,cins);
    }
    
    @Override
    void sesCikar(){
        System.out.println("cik cik");
    }
    
    
}
