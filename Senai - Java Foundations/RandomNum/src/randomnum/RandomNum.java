/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomnum;
import java.util.*;

/**
 *
 * @author Aluno
 */
public class RandomNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rndNum = new Random();
        int randomNum = rndNum.nextInt(1,1000);
        System.out.println("Numero aleatorio: "+ randomNum);
        
        randomNum = rndNum.nextInt(1,1000);
        System.out.println("Numero aleatorio: "+ randomNum);
        
        randomNum = rndNum.nextInt(1,1000);
        System.out.println("Numero aleatorio: "+ randomNum);
        
        randomNum = rndNum.nextInt(1,1000);
        System.out.println("Numero aleatorio: "+ randomNum);
        
        System.out.println("--------------");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

    }
    
}
