/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinhev2;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class AdivinheV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        Random rndNum = new Random();
        int randomNum = rndNum.nextInt(1,101);
        Scanner sc = new Scanner(System.in);
        int palpite =-1;
        int numPalpites = 0;
         
        while(true){
            String input = (String)JOptionPane.showInputDialog(null,
                "Insira seu palpite:",
                "Palpite",
                3,
                null,
                null,
                "Palpite"); 
                
            palpite = Integer.parseInt(input);
            numPalpites++;
            if(palpite==randomNum){
                String msg = "Parabens voce acertou em "+ numPalpites +" palpites!";
                JOptionPane.showMessageDialog(null, msg , "Atenção", JOptionPane.INFORMATION_MESSAGE);              
                System.exit(0);
            }
            else{
                if (palpite<randomNum) {
                    String msg = "Printe um numero MAIOR que " + palpite;
                    JOptionPane.showMessageDialog(null, msg , "Atenção", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    String msg = "Printe um numero MENOR que " + palpite;
                    JOptionPane.showMessageDialog(null, msg , "Atenção", JOptionPane.WARNING_MESSAGE);
                }
            }
        }             
    }   
}