
package Programas;

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {

    public static void main(String[] args) {
        
        //Nombre_Clase Objeto = new Nombre_Clase();
        
        Scanner reader = new Scanner(System.in);//sout
        System.out.println("Cantidad de Datos: ");
        int c= reader.nextInt();
        System.out.println("Dato Menor ");
        int valorInicial=reader.nextInt();
        System.out.println("Dato Mayor ");
        int valorFinal=reader.nextInt();
        
        for(int i=1; i<=c;i++){
            double ale=(Math.random()*(valorFinal-valorInicial)+valorInicial);
            System.out.println("El no "+i+" es "+ale);
        }
        
        
        
    }
    
}
