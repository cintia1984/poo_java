
package poo.java.entidades;


public class Circuferencia {
   private double Radio;
 


    public Circuferencia() {
    }

    public Circuferencia(double Radio) {
        this.Radio = Radio;
     
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
     public double Area(){
       double Area = Radio * 3.14;
       
       return Area;
    }
     public double Perimetro(){
         double Perimetro = 2 * 3.14 * Radio;
         return Perimetro;
     }

}

   
    
   

