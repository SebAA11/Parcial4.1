package Main;

import javax.swing.JOptionPane;
        
public class Libro {

    public String Titulo;
    public String Autor;
    public int Ejemplares;
    public int Prestamos;
    public int Contador;

    public Libro(String Titulo, String Autor, int Ejemplares, int Prestamos) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Ejemplares = Ejemplares;
        this.Prestamos = Prestamos;
    }

    public Libro() {
        this.Titulo = "";
        this.Autor = "";
        this.Ejemplares = 0;
        this.Prestamos = 0;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getEjemplares() {
        return Ejemplares;
    }

    public int getPrestamos() {
        return Prestamos;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setEjemplares(int Ejemplares) {
        this.Ejemplares = Ejemplares;
    }

    public void setPrestamos(int Prestamos) {
        this.Prestamos = Prestamos;
    }
    
     public boolean prestar() {
        for (int i = 0; i < Ejemplares; i++) {
            if (Prestamos < Ejemplares) {
                Prestamos++;
                return true;
            }
        }
        return false;
    }
     public boolean devolver() {
        if (Prestamos > 0) {
            Prestamos--;
            return true;
        }
        return false;
    }
     public void imprimir() {
        JOptionPane.showMessageDialog(null, "Título: " + Titulo + "\nAutor: " + Autor +
                "\nNúmero de ejemplares: " + Ejemplares +
                "\nEjemplares prestados: " + Prestamos, "Información del Libro", JOptionPane.INFORMATION_MESSAGE);
    }
}