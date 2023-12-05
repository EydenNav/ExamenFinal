/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamen05;

/**
 *
 * @author eyden
 */
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class main extends JFrame{
     private JTextField numerosField;
   private JButton Limpar;
   private JButton Calcular;

    public static void main(String[] args) {
        
      
        
        // Crear un nuevo marco (ventana)
        JFrame marco = new JFrame("Examen Programacion avanzada");
        marco.setSize(300, 200); // Establecer el tamaño del marco
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Hacer que se cierre al presionar la "X"

        // Crear un nuevo panel
        JPanel panel = new JPanel();

        // Crear un botón
        
         JLabel EtiquetaA = new JLabel ("Numero A:");
         JTextField numerosField = new JTextField(22);
         
         JLabel EtiquetaB = new JLabel ("Numero B:");
         JTextField CuadroB = new JTextField(20);
         
         JLabel EtiquetaC = new JLabel ("Numero C:");
         JTextField CuadroC = new JTextField(20);
         
         JButton Calcular = new JButton ("Calcular");
         
         
            
          JButton Limpar = new JButton ("Limpiar");
          
            
        
        // Agregar el botón al panel
          panel.add(EtiquetaA);
           panel.add(numerosField);
           
           panel.add(EtiquetaB);
           panel.add(CuadroB);
           
           panel.add(EtiquetaC);
           panel.add(CuadroC);
           
           panel.add (Calcular);
           panel.add(Limpar);
           
    
           
           
           
           
        // Agregar el panel al marco
        marco.add(panel);

        // Hacer visible el marco
        marco.setVisible(true);
    }
    
    private void Limpar(){
    
        
        
    }
}

