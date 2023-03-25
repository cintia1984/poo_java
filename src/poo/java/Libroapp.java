
package poo.java;

import java.util.Scanner;
import poo.java.entidades.Libro;


public class Libroapp {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Libro ingLibro= new Libro();
        
        System.out.println("ingrese el ISBN");
        ingLibro.setISBN(leer.nextInt());
        
        System.out.println("ingrese el Titulo");
        ingLibro.setTitulo(leer.next());
        
        System.out.println("ingrese el autor");
        ingLibro.setAutor(leer.next());
        
        System.out.println("ingrese el numero de pagina");
        ingLibro.setNumpagina(leer.nextInt());
        
       
        System.out.println(ingLibro.toString());    
        }
    
}
