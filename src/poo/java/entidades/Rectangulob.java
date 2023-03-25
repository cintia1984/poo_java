
package poo.java.entidades;


public class Rectangulob {
    private double base;
    private double altura;
    private double dibujarRectangulo;

    public Rectangulob() {
    }

    public Rectangulob(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double superficie(){
        return base * altura;
    }
    public double perimetro(){
        return (base + altura)*2;
    }
    public double dibujarRectangulo(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base -1) {
                    System.out.println(" * ");   
                }else {
                    System.out.println("  ");
                }
  
            }
            System.out.println("");
 
        }
        return dibujarRectangulo;
   
    }

    @Override
    public String toString() {
        return "Rectangulob{" + "base=" + base + ", altura=" + altura + '}';
    }

    
    
    
}
