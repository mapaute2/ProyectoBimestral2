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
public class PotenciaNumero {
    
    public static void main(String[] args) {
         
        Scanner leer = new Scanner(System.in);
        
        // Declaración e inicialización de variables
        
        int base, pot, cont, result;
        
        base = 0; pot = 0; cont = 1; result = 1;
        
        System.out.println(" Programa para sacar la potencia de un número ");
        
        // Ingresar datos
        
        System.out.println(" Ingresar la base de la potencia ");
        base = leer.nextInt();
        
        System.out.println(" Ingresar la potencia ");
        pot = leer.nextInt();
        
        
        // Ciclo repetitivo que obtine la potencia de un número 
        
        while (cont <= pot){
            result = result * base;
            cont = cont + 1;
        }
        
        System.out.println(" La potencia de: "+base+" elevado a "+pot+" es "+result);
        
        // Presentar el resultado 
        
        
        
    }
    
}
