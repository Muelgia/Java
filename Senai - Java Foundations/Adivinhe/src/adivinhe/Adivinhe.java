/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinhe;
import java.util.*;
/**
 *
 * @author Aluno
 */
public class Adivinhe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        Random rndNum = new Random();
        int randomNum = rndNum.nextInt(1,101);
        Scanner sc = new Scanner(System.in);
        int palpite =-1;
        int numPalpites = 0;
        
        while(true){
            System.out.println("Seu palpite:");
            palpite = sc.nextInt();
            numPalpites++;
            if(palpite==randomNum){
                System.out.println("Parabens voce acertou em "+ numPalpites +" palpites!");
                System.exit(0);
            }
            else{
                if (palpite<randomNum) {
                    System.out.println(" ");
                    System.out.println("Printe um numero mais alto");
                }
                else{
                    System.out.println(" ");
                    System.out.println("Tente um numero mais baixo");
                }
            }
        }
        
        
           
    }
    
}
