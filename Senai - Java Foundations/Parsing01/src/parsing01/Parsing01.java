/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parsing01;

/**
 *
 * @author Aluno
 */
public class Parsing01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int shirtPrice = Integer.parseInt("15");
        double taxRate = Double.parseDouble("0.05");
        String gibberish = "FdsfoiJFIs9a";
        
        System.out.println(shirtPrice*taxRate);
        
        //int iTaxRate = Integer.parseInt(taxRate);
        
        //System.out.println("iTaxRate: " + iTaxRate);
        
    }
    
}
