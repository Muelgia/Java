/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exs4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExS4 {

    public static double F2C (double fahrenheit){
        double celsius = 0;
       
        celsius =  (fahrenheit-32) / (9.0/5.0);
       
        return celsius;
    }
            
    public static double hipotenusa(int ladoA, int ladoB){
        double hipot = 0;
        hipot = Math.sqrt((ladoA*ladoA)+(ladoB*ladoB));
        return hipot;
    }
    
    public static int roll(){
        int soma = 0;
        Random rndNum = new Random();
        int dado1 = rndNum.nextInt(6)+1;
        int dado2 = rndNum.nextInt(6)+1;
        soma=dado1+dado2;
        return soma;
    }
    
    public static String processName(String fName, String lName){
        String resp = "";
        resp=lName+", "+fName.charAt(0);
        return resp;
    }
    
    public static void main(String[] args) {
        
        
        //exercicio 1
        System.out.println(F2C(100));
        
        
        //exercicio 2
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        
        //System.out.println("Informe A:"); a = sc.nextInt();       
        //System.out.println("Informe B:"); b = sc.nextInt();
        //System.out.println("Minha Hypot: " + hipotenusa(a, b));
        
        //System.out.println("Hypot de Math: " + Math.hypot(a, b));
        
        System.out.println("\nSoma dos dados: " + roll());
        
        System.out.println("Digite o nome e sobrenome: ");
        String nome = sc.next();
        String sobrenome = sc.next();
        System.out.println(processName(nome, sobrenome));
    }
    
}
