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
public class VerificarNumeros {
    
    public static void main(String[] args) {
         
        Scanner leer = new Scanner(System.in);
        
        // Declaración e inicialización de variables
        
        int cont, n, num, sumPar, sumImpar, sumPosi, sumNega;
        
        cont = 1; n = 1; num = 0; sumPar = 0; sumImpar = 0; sumPosi = 0; sumNega = 0;
        
        // Ingresar datos de entrada
        
        System.out.println(" Ingrese el limite de número a verificar ");
        n = leer.nextInt();
        
        // Crear el ciclo para verificar los números
        
        while (cont <= n){
            
            System.out.println(" Ingrese el número a verificar");
            num = leer.nextInt();
            
            if (num % 2 == 0 ){ // Verifica si un número es par y lo suma
                sumPar = sumPar + num;
            }
            else {             // Suma de numeros impares 
                sumImpar = sumImpar + num; 
            }
            
            if (num < 0){   // Verifica si un número es positivo y suma
                sumPosi = sumPosi + num;
            }
            else {          // Suma de negativos 
                sumNega = sumNega + num;
            }     
            
            cont = cont + 1;
        }
        System.out.println(" La suma de los pares es: "+sumPar);
        System.out.println(" La suma de los impares es: "+sumImpar);
        System.out.println(" La suma de los positivos es: "+sumPosi);
        System.out.println(" La suma de los negativos es: "+sumNega);
        
        
    }
    
}
