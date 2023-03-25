
package poo.java.entidades;


public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    public int sumar(){
        int sumar = numero1 + numero2;
        return sumar;
    }
    public int restar(){
        int restar = numero1 - numero2;
        return restar;
    }
    public double dividir(){
        double dividir = numero1 / numero2;
        if (dividir == 0) {
            System.out.println("se dividio por 0, por lo que el resultado es "+0);
            
        }else{
            dividir = numero1 / numero2;
            System.out.println( "");
        }
        return dividir;
    }
    public int multiplicar(){
        int multiplicar = numero1 * numero2;
        
        if (multiplicar == 0) {
            System.out.println("se multiplico por 0, por lo tanto el resultado es :"+0); 
            
        }else{
            multiplicar = numero1*numero2;
            System.out.println("");
        }
        return multiplicar;
    }
    
    
    
}
