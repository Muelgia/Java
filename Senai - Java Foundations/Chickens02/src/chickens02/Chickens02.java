/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chickens02;

/**
 *
 * @author Aluno
 */
public class Chickens02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int segunda = 100;
        int terca = 121;
        int quarta = 117;
        
        int totalDias = segunda + terca + quarta;
        
        double dailyAverage, monthlyAverage, monthlyProfit;
       
        dailyAverage = (double) totalDias / 3;
        monthlyAverage = (double) dailyAverage * 30;
        monthlyProfit = (double) monthlyAverage * 0.18;
        
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
        
    }
    
}
