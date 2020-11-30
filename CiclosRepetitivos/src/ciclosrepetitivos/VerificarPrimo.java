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
public class VerificarPrimo {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Declaración e inicialización de variables 
        
        int cont, cont1, n, divisor, num;
        
        num = 0; cont = 1; n = 1;cont1 = 1; divisor = 0;
        
        System.out.println(" cont");
        
        // Ingresar datos de entrada
        
        System.out.println(" Ingrese el limite de números a verificar si son primos");
        n = leer.nextInt();
        
        while (cont <= n){
        
            System.out.println(" Ingrese el número a verificar ");
            num = leer.nextInt();
            
            while (cont1 <= num){
                
                if (num % cont1 == 0){
                    
                    divisor = divisor + 1;
                }
                cont1 = cont1 + 1;
            }
            
            if (divisor == 2){
                
                System.out.println(num + " es Primo");
                System.out.println("--------");
            }
            else{
                System.out.println(num + " no es Primo");
                System.out.println("----------");
            }
            cont1 = 1;
            divisor = 0;
            cont = cont + 1;
        
        }       
    }  
}
