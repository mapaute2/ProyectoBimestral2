/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobimestral2;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class ProyectoBimestral2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        // Declaración e inicialización de variables
        int n = 0;
        int suma = 0;
        
        // Datos de entrada

        System.out.println("Ingrese el tamaño del vector: ");
        n = leer.nextInt();
        
        int [] A = new int [n];
        
        System.out.println("Ingrese los elementos del vector: ");
        
	//Ciclo
        
        for (int i = 0; i< n; i++){
            
            System.out.println("Ingrese el elemento A[" +i +"] = ");
            
            A[i] = leer.nextInt();
            
        }
        
        for (int i = 0; i< n; i++){
            
            if (A[i]%2==0){
                
                suma = suma + A[i];
            }
        }
        
        System.out.println("La suma de los números pares dentro del vector es: " +suma);
    }
    
}
