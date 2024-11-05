/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colorrange;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ColorRange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor em nm: ");
        double nm = sc.nextDouble();
        if (nm > 380 || nm <= 750) {System.out.println("nm invalido");}
        if (nm >= 380 && nm<450) {System.out.println("Violeta");}
        if (nm >= 450 && nm<495) {System.out.println("Azul");}
        if (nm >= 495 && nm<570) {System.out.println("Verde");}
        if (nm >= 570 && nm<590) {System.out.println("Amarelo");}
        if (nm >= 590 && nm<620) {System.out.println("Laranja");}
        if (nm >= 620 && nm<750) {System.out.println("Vermelho");}
    }
    
}
