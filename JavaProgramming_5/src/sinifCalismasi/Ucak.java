/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinifCalismasi;

/**
 *
 * @author aedemirsen
 */
public class Ucak implements Arac{
    
    private String aracTuru;
    private int tekerlekSayisi;
    private String kullanimAlani;
    

    @Override
    public void setAracTuru(String aracTuru) {
       this.aracTuru = aracTuru;
    }

    @Override
    public String getAracTuru() {
        return aracTuru;
    }

    @Override
    public int getTekerlekSayisi() {
        return tekerlekSayisi;
    }

    @Override
    public String getKullanimAlani() {
        return kullanimAlani;
    }
    
    @Override
    public void setTekerlekSayisi(int tekerlekSayisi) {
       this.tekerlekSayisi = tekerlekSayisi;
    }

    @Override
    public void setKullanimAlani(String kullanimAlani) {
        this.kullanimAlani = kullanimAlani;
    }
    
}
