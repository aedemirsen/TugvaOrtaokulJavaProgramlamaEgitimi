/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogramming_5;

/**
 *
 * @author aedemirsen
 */
public interface Hayvan {
    
    String getTur();
    String getCins();
    boolean kuyruk();
    
}


class Kus implements Hayvan{
    
    String tur,cins;
    boolean kuyrukVarMi;
    
    @Override
    public String getTur(){
        return tur;
    }
    
    @Override
    public String getCins(){
        return cins;
    }
    
    @Override
    public boolean kuyruk(){
        return kuyrukVarMi;
    }
    
}

