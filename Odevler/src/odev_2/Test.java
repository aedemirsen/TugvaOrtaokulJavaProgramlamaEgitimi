/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev_2;

/**
 *
 * @author aedemirsen
 */
public class Test {
    
    public static void main(String[] args) {
        
        
        //50 KİŞİ KAPASİTELİ REHBERİMİ OLUŞTURDUM.
        Rehber rehberim = new Rehber(50);  
        
        //REHBERİME YENİ KİŞİLER EKLİYORUM
        rehberim.kisiEkle("555555555", "Hasmet Yaratik");
        rehberim.kisiEkle("333333333", "Okkes Elamet");
        rehberim.kisiEkle("999999999", "Celali Tiken");
        
        //ARTIK REHBERİMDE 3 KİŞİ KAYITLI ŞİMDİ BUNLARI SORGULAYALIM...
        
        System.out.println("Rehberimdeki Kişiler: ");
        for (int i = 0; i < rehberim.index; i++) {
            System.out.println((i + 1) + ".) " + rehberim.isimler[i] + " - " + rehberim.numaralar[i]);
        }
        
        //Şimdi ismi Hasmet Yaratik olan kişinin rehberimde kayıtlı olan numarasını bulalım
        for (int i = 0; i < rehberim.index; i++) {
            if (rehberim.isimler[i] == "Hasmet Yaratik") {
                System.out.println(rehberim.numaralar[i]);
            }
        }
          
        //Şimdi de numarası 333333333 olan kişinin rehberimde kayıtlı olduğu ismi bulalım
        for (int i = 0; i < rehberim.index; i++) {
            if (rehberim.numaralar[i] == "333333333") {
                System.out.println(rehberim.isimler[i]);
            }
        }
        
        
    }
    
}
