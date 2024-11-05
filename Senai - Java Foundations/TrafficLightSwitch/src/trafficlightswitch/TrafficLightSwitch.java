/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trafficlightswitch;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class TrafficLightSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero da cor: ");
        int currentColor = sc.nextInt();
        switch (currentColor){
        case 1: System.out.println("Proxima cor: Verde");
            break;
        case 2: System.out.println("Proxima cor: Amarelo");
            break;
        case 3: System.out.println("Proxima cor: Vermelho");
            break;
        default: System.out.println("Numero invalido!");
        }
    }
    
}
