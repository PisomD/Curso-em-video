/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaosistema;

import java.awt.Toolkit;
import java.awt.Dimension;
/**
 *
 * @author davi
 */
public class ResolucaoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = screenSize.height;
        int altura = screenSize.width;

        System.out.println("Sua resolução é: " + largura + " X " + altura);
    }
    
}
