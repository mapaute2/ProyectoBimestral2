/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraslogicasrepetitivas;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EstructurasLogicasRepetitivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
       //Declaración e iniialización de variables 
        
        int n = 100;
        int multiplo = 5;
        int i = 0;
        
        
        System.out.println("***PROGRAMA QUE MUESTRE LOS NÚMEROS MÚLTIPLOS DE 5 DE 0 A 100***");
        System.out.println("BUCLE (FOR)");
        
        //Ciclo
        for ( i=0; i<=n; i++){
                if (i%multiplo ==0){
                    System.out.println(i);
                }         
        }
        
        System.out.println("**BUCLE(Do-While)**");
        
        //Ciclo
        
        i = 0;
        do {
            if(i % multiplo == 0){
               System.out.println(i);          
            }   
             i++;
             
        }while (i <= n);   
    }
}
       

    
    
     
