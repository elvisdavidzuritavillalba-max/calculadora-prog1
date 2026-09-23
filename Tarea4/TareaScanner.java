/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareascanner;
import java.util.Scanner;

public class TareaScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Tarea Programacion 1 - Elvis David Zurita Villalba");
        System.out.println("=== CALCULADORA BASICA ===");
        
        System.out.print("Primer numero: ");
        double num1 = entrada.nextDouble();
        
        System.out.print("Segundo numero: ");
        double num2 = entrada.nextDouble();
        
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        
        System.out.println("");
        System.out.println("RESULTADOS:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        
        if(num2 != 0){
            double division = num1 / num2;
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: No se puede entre 0");
        }
        
        entrada.close();
    }
}
