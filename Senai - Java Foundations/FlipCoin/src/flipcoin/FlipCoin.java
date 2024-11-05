/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flipcoin;
import java.util.*;
/**
 *
 * @author Aluno
 */
public class FlipCoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // 50% chance heads, 50% chance tails
        Random rand = new Random();
        double chance = rand.nextDouble();
        System.out.println(chance<0.5?"Cara":"Coroa");
    }
    
}
