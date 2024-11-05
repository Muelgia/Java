/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package namemaker;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class NameMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Primeiro nome:");
        String firstName = sc.nextLine();
        
        System.out.println("Segundo nome:");
        String middleName = sc.nextLine();
        
        System.out.println("Ultimo nome:");
        String lastName = sc.nextLine();
                     
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Seu nome completo é " + fullName);
    }
    
}
