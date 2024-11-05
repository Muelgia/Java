/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rockpaperscissor;
import java.util.*;
/**
 *
 * @author Aluno
 */
public class RockPaperScissor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rndNum = new Random();
        int randomNum = rndNum.nextInt(3);
        
        if(randomNum==0){
            System.out.println("Pedra");
        }
        
        if(randomNum==1){
            System.out.println("Tesoura");
        }
        
        if(randomNum==2){
            System.out.println("Papel");
        }
    }
}
