/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trafficlightchecker;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class TrafficLightChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero da cor: ");
        int currentColor = sc.nextInt();
        if (currentColor < 1 || currentColor > 3) {System.out.println("Numero invalido!");}
        if (currentColor == 1) {System.out.println("Proxima cor: Verde");}
        if (currentColor == 2) {System.out.println("Proxima cor: Amarelo");}
        if (currentColor == 3) {System.out.println("Proxima cor: Vermelho");}
    }
    
}
