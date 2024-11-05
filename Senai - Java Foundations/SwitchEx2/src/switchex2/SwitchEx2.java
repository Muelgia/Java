/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchex2;

/**
 *
 * @author Aluno
 */
public class SwitchEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here public static void main(String args[]) {
         char option = 'A';
        int aCount = 0, bCount = 0, cCount = 0;
        switch (option) {
            case 'A':
                aCount++;
                System.out.println("Count of A  " + aCount);
                break;
            case 'B':
                bCount++;
                System.out.println("Count of B  " + bCount);
                break;
            case 'C':
                cCount++;
                System.out.println("Count of C  " + cCount);
                break;
    }
    
}
}