/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prácticaevaluada1;

import javax.swing.JOptionPane;

/**
 *
 * @author Brayan Molina
 */
public class PrácticaEvaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Input de datos:
        String nombre = "";
        nombre = JOptionPane.showInputDialog("Digite su nombre:");

        String apellido = "";
        apellido = JOptionPane.showInputDialog("Digite su apellido:");

        String lectura;
        double salario;
        
        lectura = JOptionPane.showInputDialog("Digite su salario en colones:");
        salario = Double.parseDouble(lectura);

        //IF e IF ELSE:
        /*if (salario >= 1352000) {
            impuestoSalario + salario;
            System.out.println("");

        }

    }

}
