
package poo.java.entidades;


public class Libro {
   private int ISBN;
   private String Titulo;
   private String Autor;
   private int Numpagina;

    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String Autor, int Numpagina) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Numpagina = Numpagina;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumpagina() {
        return Numpagina;
    }

    public void setNumpagina(int Numpagina) {
        this.Numpagina = Numpagina;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Numpagina=" + Numpagina + '}';
    }
    
    
        
    
   
}
