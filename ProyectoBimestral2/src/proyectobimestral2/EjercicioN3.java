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
public class EjercicioN3 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int n = 4;
        int nume = 0;
        int cont1 = 0;
        
        int[][] A = new int[n][n];
             
        System.out.println("Ingrese los valores de la matriz A");
        
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                
                System.out.print("A["+i+"]["+j+"] = ");
                A[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("Arreglo actual");
        for(int i = 0; i<n; i++){
            for(int j= 0; j<n; j++){
                System.out.print(A[i][j]+ " ");
            }
            
            System.out.println("\n");
        }
        
        System.out.println("Ingrese el número a verificar las veces que se repite");
        nume = leer.nextInt();
        
        cont1 = Numero(A,n,nume);
        
        System.out.println("Las veces que el número " +nume+ " se repitio en la matriz es " +cont1+ " veces");
        
    }
    
    public static int Numero(int[][] A, int n, int nume){
        
        int cont = 0;
        
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                
                if (A[i][j] == nume){
                    
                    cont = cont + 1;
                }
            }
        }  
        
        return cont;
    }
     
}
