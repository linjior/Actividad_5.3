
package Programas;

import Clases.DatosDesordenados;
import javax.swing.JOptionPane;

public class Alerartorios {

    public static void main(String[] args) {
        DatosDesordenados ordenar=new DatosDesordenados();
        
        int n,s;
        
        n = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Cuántos datos son?"));
        s = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Cuál es el valor máximo?"));
        
        int [] arreglo = new int[n];
        for (int i=0; i<n; i++){
            arreglo[i] = (int)(Math.random() * s) + 1;
            System.out.println("Arreglo: "+(i+1)+"--->"+arreglo[i]);
        }
        
        ordenar.Radix(arreglo);
    }
    
}
