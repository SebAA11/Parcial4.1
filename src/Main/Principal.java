package Main;

import javax.swing.JOptionPane;

public class Principal {

    
    public static void main(String[] args) {
        Libro libro = new Libro("El principito", "Antoine de Saint-Exupéry", 5, 2);
        
        libro.imprimir(); // Mostrar estado inicial
        
        if (libro.prestar()) {
            JOptionPane.showMessageDialog(null, "Se ha realizado el préstamo correctamente.", "Préstamo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay ejemplares disponibles para prestar.", "Préstamo", JOptionPane.WARNING_MESSAGE);
        }
        
        libro.imprimir(); // Mostrar estado después del préstamo
        
        if (libro.devolver()) {
            JOptionPane.showMessageDialog(null, "Se ha realizado la devolución correctamente.", "Devolución", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay ejemplares prestados para devolver.", "Devolución", JOptionPane.WARNING_MESSAGE);
        }
        
        libro.imprimir(); // Mostrar estado después de la devolución
    }
}

