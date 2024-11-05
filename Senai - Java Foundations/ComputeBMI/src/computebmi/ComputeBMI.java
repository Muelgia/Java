/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computebmi;

import java.util.*;

/**
 *
 * @author Aluno
 */
public class ComputeBMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner sc = new Scanner(System.in);
   
        System.out.println("Peso (kg): ");
        peso = sc.nextDouble();
        
        System.out.println("Altura: ");
        altura = sc.nextDouble();
        
        imc = Math.ceil(peso / Math.pow(altura, 2));
        System.out.println("Seu IMC: " + imc);
        
        if(imc < 18.5){
            System.out.println("Magreza");
        }
        
        if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Saudavel");
        }
        
        if(imc >= 25 && imc <= 29.9){
            System.out.println("Sobrepeso");
        }
        
        if(imc >= 30){
            System.out.println("Obesidade");
        }
    }    
}
