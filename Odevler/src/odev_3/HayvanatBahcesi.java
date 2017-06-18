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
public class HayvanatBahcesi {

    final int kapasite;
    int nufus;
    Fil filler[];
    int filSayisi;
    Kokarca kokarcalar[];
    int kokarcaSayisi;
    Kus kuslar[];
    int kusSayisi;
    Hayvan hayvanlar[];

    public HayvanatBahcesi(int kapasite) {
        this.kapasite = kapasite;
        hayvanlar = new Hayvan[kapasite];
        filler = new Fil[10];
        kuslar = new Kus[50];
        kokarcalar = new Kokarca[25];
        nufus = 0;
    }

    int getNufus() {
        return nufus;
    }

    int getFilSayisi() {
        return filSayisi;
        /* int sayi = 0;
        for (int i = 0; i < filler.length; i++) {
            if (filler[i] != null) {
                sayi++;
            }
        }
        return sayi;*/
    }

    int getKokarcaSayisi() {
        return kokarcaSayisi;
    }

    int getKusSayisi() {
        return kusSayisi;
    }

    void hayvanEkle(Hayvan h) {
        hayvanlar[nufus] = h;
        nufus++;
        if (h.cins == "Fil") {
            filler[filSayisi] = (Fil) h;
            filSayisi++;
        } else if (h.cins == "Kus") {
            kuslar[kusSayisi] = (Kus) h;
            kusSayisi++;
        } else if (h.cins == "Kokarca") {
            kokarcalar[kokarcaSayisi] = (Kokarca) h;
            kokarcaSayisi++;
        }
    }

}
