
package Programas;

public class Alerartorios {

    public static void main(String[] args) {
        
        int A[] = new int[1000];
        
        for(int i=0;i<1000;i++){
        A[i]=(int)(Math.random()*15*5);
        System.out.println("arreglo "+(i+1)+"--->"+A[i]);
        }
        
        
        
    }
    
}
