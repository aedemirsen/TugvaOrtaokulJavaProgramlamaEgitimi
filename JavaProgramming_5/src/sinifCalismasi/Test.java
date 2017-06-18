/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinifCalismasi;

import java.util.ArrayList;

/**
 *
 * @author aedemirsen
 */
public class Test {
    
    public static void main(String[] args) {
        
        ArrayList<Arac> araclar = new ArrayList<>();
        
        Arac araba1 = new Araba();
        araba1.setAracTuru("araba");
        araba1.setKullanimAlani("Mars");
        araba1.setTekerlekSayisi(10);
        
        Arac gemi1 = new Gemi();
        gemi1.setAracTuru("gemi");
        gemi1.setKullanimAlani("deniz");
        gemi1.setTekerlekSayisi(0);
        
        Arac ucak1 = new Ucak();
        ucak1.setAracTuru("ucak");
        ucak1.setKullanimAlani("gokyuzu");
        ucak1.setTekerlekSayisi(5);
        
        araclar.add(araba1);
        araclar.add(gemi1);
        araclar.add(ucak1);
        
        for (int i = 0; i < araclar.size(); i++) {
            System.out.println("arac " + (i+1) + " = " + araclar.get(i).getAracTuru());
        }
        
        
    }
    
}
