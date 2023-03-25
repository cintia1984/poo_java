/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.java;

import java.util.Scanner;
import poo.java.entidades.Operacion;

/**
 *
 * @author cinti
 */
public class Operacionapp {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Operacion crearOperacion = new Operacion();
        
        System.out.println("ingrese un numeros");
        crearOperacion.setNumero1(leer.nextInt());
        
        System.out.println("ingrese otro numero");
        crearOperacion.setNumero2(leer.nextInt());
        
         System.out.println("la suma es :" + crearOperacion.sumar());
         System.out.println("la resta es :" +crearOperacion.restar());
        
         System.out.println("la division es :" + crearOperacion.dividir());
         System.out.println("la multiplicacion es : " + crearOperacion.multiplicar());
         
         
    }
    
    
}
