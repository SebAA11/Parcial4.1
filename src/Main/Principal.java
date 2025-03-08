package Main;

import javax.swing.JOptionPane;

public class Principal {

    
   public static void main(String[] args) {
        
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", 5, 2);

        Libro libro2 = new Libro();
        libro2.setTitulo(JOptionPane.showInputDialog("Ingrese el título del libro:"));
        libro2.setAutor(JOptionPane.showInputDialog("Ingrese el autor del libro:"));
        libro2.setEjemplares(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ejemplares:")));
        libro2.setPrestamos(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ejemplares prestados:")));
        
        libro1.imprimir();
        libro2.imprimir();
        
        
        if (libro1.prestar()) {
            JOptionPane.showMessageDialog(null, "Prestamo realizado correctamente.", "Préstamo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Sin ejemplares disponibles.", "Préstamo", JOptionPane.WARNING_MESSAGE);
        }
        libro1.imprimir();
        
        if (libro1.devolver()) {
            JOptionPane.showMessageDialog(null, "Devolución realizada correctamente.", "Devolución", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay ejemplares prestados para devolver.", "Devolución", JOptionPane.WARNING_MESSAGE);
        }
        libro1.imprimir();
        
        
        if (libro2.prestar()) {
            JOptionPane.showMessageDialog(null, "Prestamo realizado correctamente.", "Préstamo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Sin ejemplares disponibles.", "Préstamo", JOptionPane.WARNING_MESSAGE);
        }
        libro2.imprimir();
        
        if (libro2.devolver()) {
            JOptionPane.showMessageDialog(null, "Devolución realizada correctamente.", "Devolución", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay ejemplares prestados para devolver.", "Devolución", JOptionPane.WARNING_MESSAGE);
        }
        libro2.imprimir();
    }
    }
/* Atributos nuevos podrian ser
  °Editorial
  °Año de publicación
*/


