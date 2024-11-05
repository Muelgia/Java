/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator2;

/**
 *
 * @author Aluno
 */
public class Calculator2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator p1 = new Calculator();
        Calculator p2 = new Calculator();
        Calculator calc = new Calculator();
        double totMesa = 0;

        totMesa += p1.findTotal(10.0, "Vini");
        
  
        totMesa += p2.findTotal(33.0, "Carlos");
        
        calc.tax = 0.10;
        calc.tip = 0.10;
  
        totMesa += calc.findTotal(20.0, "Roberto");
        System.out.println("Total da mesa: $" + totMesa);
        System.out.println("Divisao igual: $" + calc.calculate(2, totMesa));
    }
    
}
