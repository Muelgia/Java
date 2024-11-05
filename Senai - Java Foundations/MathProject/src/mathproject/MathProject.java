/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathproject;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class MathProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x = Math.sqrt(144);
        System.out.println(x);
        System.out.println(Math.PI);
        System.out.println("\n\n");
        
        
        int age = 45;
        
        //limita o min da idade a 0
        age = Math.max(0, age);
        System.out.println(age);
        
        //limita o max da idade a 40
        age = Math.min(40, age);
        System.out.println(age); 
        
        //implementando em uma linha só
        age = Math.min(40, Math.max(0, age));
        System.out.println(age);
        
        System.out.println("\n\n");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o raio: ");
        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Area do circulo: " + area);
   }
    
}
