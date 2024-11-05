/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1_replace;

/**
 *
 * @author Aluno
 */
public class JavaApplication1_Replace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String escola = "Senai Mario Dedini";
        System.out.println(escola);
        
       escola = escola.replace("ena", "ENA");
       System.out.println(escola);
       
       escola = escola.substring(6);
       System.out.println(escola);
    }
    
}
