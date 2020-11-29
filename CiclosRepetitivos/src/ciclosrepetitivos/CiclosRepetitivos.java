/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclosrepetitivos;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class CiclosRepetitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Declaración e inicialización de variables 
        int i, n, suma;
        i = 1; n = 0; suma = 0;
        
        System.out.println(" Programa para calcular la suma de los primero diez números ");
        
        // Pedir que se ingrese el limite de los números
        System.out.println(" Ingrese el limite de números a presentar ");
        n = leer.nextInt();
        
        // Iniciamos el ciclo repetitivos while
        
        while (i <= n){           
            suma = suma + i;
            i = i + 1;
        }
        System.out.println(" La suma de los número es: " +suma);
 
    }
    
}
