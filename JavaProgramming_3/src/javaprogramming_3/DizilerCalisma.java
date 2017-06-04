/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogramming_3;

/**
 *
 * @author aedemirsen
 */
public class DizilerCalisma {

    public static void main(String[] args) {

        //Array (Dizi)
        //Icerisinde tek turden degiskenler tutan yapilara denir.
        int e = 8;
        int a = 3;
        int k = 9;
        int y = 1;
        int s = 10;
        /*    
        //Yontem 1
        int kantinSirasi [] = new int [5];
        
        kantinSirasi[0] = e;
        kantinSirasi[1] = a;
        kantinSirasi[2] = k;
        kantinSirasi[3] = y;
        kantinSirasi[4] = s;
        
        
        for (int i = 0; i < kantinSirasi.length; i++) {
            System.out.println((i+1)+". siradaki = "+kantinSirasi[i]);
        }
      
        //Yontem 2
        int kantinSirasi [] = {e,a,k,y,s};
    
        for (int i = 0; i < kantinSirasi.length; i++) {
            System.out.println((i+1)+". siradaki = "+kantinSirasi[i]);
        }
         */

        //OGRENCI DIZISI
        Ogrenci ogrenciler[] = new Ogrenci[3];

        Ogrenci ogrenci1 = new Ogrenci("Hasmet", "Yaratik", 555);
        Ogrenci ogrenci2 = new Ogrenci("Okkes", "Elamet", 234);
        Ogrenci ogrenci3 = new Ogrenci("Celali", "Tiken", 117);

        ogrenciler[0] = ogrenci1;
        ogrenciler[1] = ogrenci2;
        ogrenciler[2] = ogrenci3;
        
        for (int i = 0; i < ogrenciler.length; i++) {
            ogrenciler[i].kim();
        }

    }

}
