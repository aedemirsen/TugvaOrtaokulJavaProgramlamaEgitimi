/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev_4.soru3;

/**
 *
 * @author aedemirsen
 */
public class Malzeme implements MalzemeInterface{
    
    private final String barkodNo;
    String uretici;
    
    Malzeme(String barkodNo){
        this.barkodNo = barkodNo;
    }

    @Override
    public String getBarkodNo() {
        return barkodNo;
    }

    @Override
    public String getUretici() {
        return uretici;
    }

    @Override
    public void setUretici(String uretici) {
        this.uretici = uretici;
    }
    
    
}
