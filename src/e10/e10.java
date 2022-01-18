
package e10;

import java.util.Scanner;


public class e10 {

    
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
       String frase;
        System.out.println("Ingrese la frase: ");
        frase = Entrada.nextLine();
        
        if(frase.substring(0, 1).equals("A")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
                
                
    }
    
}
