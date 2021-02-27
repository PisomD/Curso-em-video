/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomasistema;

import java.util.Locale;
/**
 *
 * @author davi
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale idiomaLocal = Locale.getDefault();
        System.out.println("O seu sistema esta em: " + idiomaLocal.getDisplayLanguage());
    }
    
}
