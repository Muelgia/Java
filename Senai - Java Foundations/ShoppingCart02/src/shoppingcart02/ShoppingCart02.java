/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoppingcart02;

/**
 *
 * @author Aluno
 */
public class ShoppingCart02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Camisas  ";
        String message = custName+" quer comprar duas "+itemDesc;
        
        double price, tax;
        int quantity;   
        
        price = 10.0;
        tax = 2.89;
        quantity = 2;
          
        System.out.println(message);
        System.out.println("O custo total com o imposto e: $"+ String.format("%.2f", ((price + tax) * quantity)));
    }
    
}
