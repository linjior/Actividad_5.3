
package Programas;

import Clases.DatosDesordenados;
import javax.swing.JOptionPane;

public class Presentacion {

    public static void main(String[] args) {
        
        DatosDesordenados ordenar=new DatosDesordenados();
        
        int vector1[]={5,6,3,44,22,1};
        int vector2[]={55,4,43,44,2,10,4567,4563};
        int vector3[]={5,2,1,8,3,9,7};
        
        
        //BURBUJAS
        System.out.print("Arreglo original");
        ordenar.mostrarArreglo(vector1);
        System.out.print("Arreglo ordenado Con burbuja 1: ");
        ordenar.burbuja(vector1);
        ordenar.mostrarArreglo(vector1);
        
        System.out.print("Arreglo original");
        ordenar.mostrarArreglo(vector2);
        System.out.print("Arreglo ordenado Con burbuja 2: ");
        ordenar.burbija2(vector2);
        ordenar.mostrarArreglo(vector2);
        
        //RADIX
        System.out.println("El arreglo original");
        ordenar.mostrarArreglo(vector2);
        ordenar.Radix(vector2);

        //QUICK
        System.out.println("El arreglo original");
        ordenar.mostrarArreglo(vector3);
        System.out.println("El arreglo ordenado con Quick");
        ordenar.quick(vector3, 0, vector3.length-1);

        int tam;
        tam=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el tamano del Arreglo"));
        
        int vectorcito[]=new int[tam];
        
        for(int i=0;i<tam;i++){
            vectorcito[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento del indice "+i+":"));
            ordenar.insersion(vectorcito, i+1 );
        }
        
        
        //System.out.println("Vector Original");
        //ordenar.mostrarArreglo(vector3);
        //ordenar.sell(vector3);
        
        
         
    }
    
}
