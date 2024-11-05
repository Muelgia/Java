/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchex3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class SwitchEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quantos dias: ");
        int dias = sc.nextInt();
        switch (dias) {
            case 28: System.out.println("28 fevereiro");
            case 29: System.out.println("29 fevereiro");
                    break;
            case 30:System.out.println("30: abril");
                    System.out.println("30: junho");
                    System.out.println("30: setembro");
                    System.out.println("30: novembro");
                    break;
            case 31:System.out.println("31: janeiro");
                    System.out.println("31: marco");
                    System.out.println("31: maio");
                    System.out.println("31: julho");
                    System.out.println("31: agosto");
                    System.out.println("31: outubro");
                    System.out.println("31: dezembro");
                    break;
            default: System.out.println("Dias indefinidos para mes");
                
        }
    }
    
}
