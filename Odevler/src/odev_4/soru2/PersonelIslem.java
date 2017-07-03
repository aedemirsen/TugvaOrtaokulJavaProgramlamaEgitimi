/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev_4.soru2;

import java.util.ArrayList;

/**
 *
 * @author aedemirsen
 */
public class PersonelIslem {
    
    
    //1.metod
    ArrayList<Personel> arrayToList(Personel [] personeller){
        ArrayList<Personel> personellerListe = new ArrayList<>();
        for (int i = 0; i < personeller.length; i++) {
            personellerListe.add(personeller[i]);
        }
        return personellerListe;
    }
    
    //2.metod
    Personel[] listToArray(ArrayList<Personel> personeller) {
        Personel personel[] = new Personel[personeller.size()];
        for (int i = 0; i < personeller.size(); i++) {
            personel[i] = personeller.get(i);
        }
        return personel;
    }
    
    //3.metod -- BURADA İLK ÖNCE PERSONELLERİ MAAŞA GÖRE SIRALAMAMIZ GEREKİYOR.
    //A
    ArrayList<Personel> maasaGoreSirala(ArrayList<Personel> personeller){
        boolean degistirildiMi;
        do {
            degistirildiMi = false;
            for (int i = 1; i < personeller.size(); i++) {
                if (personeller.get(i).maas > personeller.get(i - 1).maas) {
                    Personel temp = personeller.get(i);
                    personeller.remove(i);
                    personeller.add(i - 1, temp);
                    degistirildiMi = true;
                }
            }
        } while (degistirildiMi);
        return personeller;
    }    
    //B
    void kimlikNoYazdir(ArrayList<Personel> personeller){
        ArrayList<Personel> siraliListe = maasaGoreSirala(personeller);
        for (int i = 0; i < siraliListe.size(); i++) {
            System.out.println(siraliListe.get(i).kimlikNo);
        }
    }
    
    //4.metod
    ArrayList<Personel> zamYap(ArrayList<Personel> personeller) {
        for (int i = 0; i < personeller.size(); i++) 
            if (personeller.get(i).maas < 2000) 
                personeller.get(i).maas += personeller.get(i).maas*(15/100);  
        return personeller;
    }
   
    //5.metod
    void enYuksekMaasliKisi(ArrayList<Personel> personeller) {
        Personel personel = personeller.get(0);
        for (int i = 0; i < personeller.size(); i++) {
            if (personeller.get(i).maas > personel.maas) {
                personel = personeller.get(i);
            }
        }
        System.out.println(personel.isim + " " + personel.soyisim + " " + personel.maas);
    }
    
    
    
}
