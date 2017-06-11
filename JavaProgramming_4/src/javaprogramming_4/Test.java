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
public class Test {
    
    public static void main(String[] args) {
        
//        //1 
//        Hayvan hayvan = new Hayvan();
//        hayvan.sesCikar();
//        
//                
//        //2
//        Kus kus1 = new Kus();  
//        Kus kus2 = new Kus("Papagan","Amazon");
//        System.out.println(kus2.tur);
//        System.out.println(kus2.cins);
//        kus1.sesCikar();
//        
//        //3
//        Kokarca kokarca = new Kokarca();
//        kokarca.sesCikar();
//        
//        //4
//        Fil fil = new Fil();
//        fil.sesCikar();

          Kus kus = new Kus("papagan","amazon");
          kus.gagaTuru = "sivri";
          kus.kanatAcikligi = 0.5;
          kus.ucabiliyorMu = true;
          kus.kilo = 13.7;
          kus.kuyrukVarMi = true;
          kus.kilSayisi = 4000;
          
          Kokarca kokarca = new Kokarca();
          kokarca.cizgiSayisi = 4;
          kokarca.kilSayisi = 3500;
          kokarca.kuyrukVarMi = true;
          kokarca.kilo = 14;
          
          Fil fil = new Fil();
          fil.hortumUzunlugu = 2;
          fil.kulakGenisligi = 105.9;
          fil.kuyrukVarMi = true;
          fil.kilSayisi = 100000;
          fil.kilo = 2600;
          
          System.out.println(kus.kuyruk());
          System.out.println(kokarca.kuyruk());
          System.out.println(fil.kuyruk());

                
        
        
        
    }
    
}
