/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chickens01;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Chickens01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int totalEggs = 0;
        int eggsPerChiken = 0;
        int chickenCount = 0;
        
        Scanner ler = new Scanner(System.in);
        
        // segunda
        System.out.println("Galinhas.......");
        chickenCount = ler.nextInt();
        
        System.out.println("Ovos por penosa: ");
        eggsPerChiken = ler.nextInt();
             
        totalEggs = eggsPerChiken * chickenCount;
        
        // terça
        chickenCount++;
        totalEggs += eggsPerChiken * chickenCount;
        
        
        // quarta
        chickenCount /= 2;
        
        totalEggs += eggsPerChiken * chickenCount;
        
        System.out.println(totalEggs);
       
    }
    
}
