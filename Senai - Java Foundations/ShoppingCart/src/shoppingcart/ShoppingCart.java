/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoppingcart;

/**
 *
 * @author Aluno
 */
public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        int spaceId = custName.indexOf(" ");
        
        firstName = custName.substring(0, spaceId);
        System.out.println(spaceId);
        System.out.println(firstName);
        

    }

    
}
