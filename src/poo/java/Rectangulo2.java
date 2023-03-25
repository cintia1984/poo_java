
package poo.java;

import java.util.Scanner;
import poo.java.entidades.Rectangulob;


public class Rectangulo2 {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       Rectangulob Rectangulo = new Rectangulob();
       
        System.out.println(" ingrese los valores para el rectangulo");
        System.out.println(" Base >> ");
        Rectangulo.setBase(leer.nextInt());
        
        System.out.println(" altura >> ");
        Rectangulo.setAltura(leer.nextInt());
        
        
        System.out.println("La superficie es :" +Rectangulo.superficie());
        System.out.println("El perimetro es : " +Rectangulo.perimetro());
        Rectangulo.dibujarRectangulo();
        System.out.println(Rectangulo.toString());   
    }
    
}
