/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogramming_6;

/**
 *
 * @author aedemirsen
 */
public class StringCalisma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String isim = "Yaratik";
        
        System.out.println("1-length()");
        int uzunluk = isim.length();        
        System.out.println(uzunluk);
        
        System.out.println("2-charAt()");
        char harf = isim.charAt(2);
        System.out.println(harf);
        
        System.out.println("3-indexOf()");
        int index = isim.indexOf("i");
        System.out.println(index);
        
        System.out.println("4-equals()");
        boolean b = isim.equals("Yaratik");
        System.out.println(b);
        
        System.out.println("5-substring()");
        String str = isim.substring(5);
        String str2 = isim.substring(3, 5);
        System.out.println(str2);
        
        System.out.println("6-contains()");
        boolean bool = isim.contains("ekmek");
        System.out.println(bool);
        
    }
    
    
    /*SORU 1
      PARAMETRE OLARAK ALACAĞI İKİ STRING İN UZUNLUKLARINI KARŞILAŞTIRSIN
      VE EN UZUN OLANI EKRANA YAZDIRSIN
    */
    void karsilastir(String s1, String s2){
        if (s1.length() > s2.length()) 
            System.out.println(s1);
        else
            System.out.println(s2);
    }
    
    /*SORU 2
      PARAMETRE OLARAK ALACAĞI STRING İÇERİSİNDE KAÇ ADET 'a' HARFİ VARDIR GERİ 
      DÖNDÜREN METODU YAZINIZ.    
    */
    int aSayisi(String s){
        int a = 0;
        for (int i = 0; i < s.length(); i++) 
            if (s.charAt(i) == 'a') 
                a++;
        return a;
    }
    
    /*SORU 3
      PARAMETRE OLARAK ALACAĞI STRING İN İÇERİSİNDE KAÇ ADET BOŞLUK VARDIR
    */
    int boslukSayisi(String s){
        int a = 0;
        for (int i = 0; i < s.length(); i++) 
            if (s.charAt(i) == ' ') 
                a++;
        return a;
    }
    
    /*SORU 4
      PARAMETRE OLARAK ALDIĞI STRING İÇİNDE YİNE PARAMETRE OLARAK ALDIĞI İKİNCİ
      STRING VARSA EKRANA VARDIR YOKSA YOKTUR YAZDIRAN METOD.*/
    void içindeVarMi(String s1, String s2){
        if (s1.contains(s2)) 
            System.out.println("Vardır");
        else
            System.out.println("Yoktur");
    }
    
    /*SORU 5
      PARAMETRE OLARAK ALINAN STRING İN HARFLERİNİ ALT ALTA EKRANA YAZDIRAN METOD
    */
    void harfleriYazdir(String s){
        for (int i = 0; i < s.length(); i++) 
            System.out.println(s.charAt(i));
    }
    
    /*SORU 6
      PARAMETRE OLARAK ALINAN STRING İN YİNE PARAMETRE OLARAK ALACAĞI INTEGER 
      DEĞERİNDEN İTİBAREN AYIRIP FARKLI BİR STRING ÜZERİNDEN GERİ DÖNDÜREN METOD 
    */
    String yeniString(String s, int index){
       return s.substring(index);
    }
    
    
}
