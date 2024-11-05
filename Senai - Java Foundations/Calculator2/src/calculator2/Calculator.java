/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator2;

/**
 *
 * @author Aluno
 */
public class Calculator {
    public double tax = 0.05;
    public double tip = 0.15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0;
    
    public double findTotal(double valor, String nome){
        this.originalPrice = valor;
        double total = (originalPrice*(1+tax+tip));
        System.out.println(nome+": $" + total);
        return(total);
    }
    
    public double calculate(int x, double y){
        double result = (double) (y/x);
        return (result);
    
    }
}


