
package e11;

import java.util.Scanner;


public class e11 {

    
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int nota;
        
        do{
            System.out.println("Ingrese un nota entre 0 y 10");
            nota = Entrada.nextInt();
            
        }while(nota < 0 || nota > 10);
        
        System.out.println("Nota ingresada es: " + nota);
    }
    
}
