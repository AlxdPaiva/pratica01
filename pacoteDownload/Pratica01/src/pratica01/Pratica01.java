/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica01;

import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class Pratica01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double raio = teclado.nextDouble();
        double area = 3.14159 * Math.pow(raio, 2);
        System.out.printf("A=%.4f%n", area);
    }
    
}
