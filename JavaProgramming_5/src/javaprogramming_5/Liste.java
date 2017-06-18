/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogramming_5;

import java.util.ArrayList;



/**
 *
 * @author aedemirsen
 */
public class Liste {

    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList();
        
        liste.add(5);
        liste.add(12);
        liste.add(3);
        liste.add(7);       
        liste.add(689312);
        liste.add(999999);
        liste.add(1105);
        liste.add(666);
        liste.add(72);
        
        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }
        
        

    }

}
