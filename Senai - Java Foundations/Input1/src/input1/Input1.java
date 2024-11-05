/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package input1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Input1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int digitado = Integer.parseInt(JOptionPane.showInputDialog("Digite algo")); 
        digitado++;
        System.out.println("Voce digitou: "+ digitado);
        
        String input = (String)JOptionPane.showInputDialog(null,"Está é uma pergunta?", 
                "Titulo da caixa de dialogo",
                2, null, null, "Digite algo a mais");
        
        System.out.println(input);
    }
}
