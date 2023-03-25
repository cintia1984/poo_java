
package poo.java;

import java.util.Scanner;
import poo.java.entidades.Circuferencia;


public class Circuferenciaapp {

    


    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       Circuferencia dato = new Circuferencia();
        System.out.println(" ingrese el area");
        dato.setRadio(leer.nextInt());
        
        
        System.out.println("el area es "+dato.Area() );
        System.out.println("el perimetro es : " +dato.Perimetro() );
        
    }
    
}
