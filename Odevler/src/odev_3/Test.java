/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev_3;

/**
 *
 * @author aedemirsen
 */
public class Test {

    public static void main(String[] args) {

        HayvanatBahcesi hb = new HayvanatBahcesi(85);

        Fil fil1 = new Fil();
        fil1.cins = "Fil";
        fil1.IQ = -1500;
        fil1.dini = "islam";
        fil1.kilSayisi = 0;
        Kus kus1 = new Kus();
        kus1.evcilMi = false;
        kus1.dayaniklilik = 122;
        kus1.cins = "Kus";

        hb.hayvanEkle(fil1);
        hb.hayvanEkle(kus1);

        for (int i = 0; i < hb.hayvanlar.length; i++) {
            System.out.println(hb.hayvanlar[i]);
        }

        Hayvan h = new Fil();

    }

}
