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
public class BucleMientras {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int i = 320;
        int n = 160;
        
        System.out.println("***PROGRAMA QUE MUESTRE LOS NÚMEROS DEL 320 AL 160 ***");
        
        //Ciclo
        
        while(i >= n){
            System.out.println(i);
            i -=20;                       
        }
    }  
}
