/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobimestral2;
import java.util.*;

/**
 *
 * @author usuario
 */
public class EjercicioN2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int mayor = 0;
        int mayor1 = 0;
        
        int[][] A = new int[4][6];
        int[][] B = new int[4][6];
        
        //Valores matriz A
        
        System.out.println("Ingrese los valores de la matriz A");
        
        for(int i=0; i<4; i++){
            for (int j=0; j<6; j++){
                
                System.out.print("A["+i+"]["+j+"] = ");
                A[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("Arreglo actual");
        for(int i = 0; i<4; i++){
            for(int j= 0; j<6; j++){
                System.out.print(A[i][j]+ " ");
            }
            
            System.out.println("\n");
        }
        
        //Valores matriz B
        
        System.out.println("Ingrese los valores de la matriz B");
        
        for(int i=0; i<4; i++){
            for (int j=0; j<6; j++){
                
                System.out.print("B["+i+"]["+j+"] = ");
                B[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("Arreglo actual");
        for(int i = 0; i<4; i++){
            for(int j= 0; j<6; j++){
                System.out.print(B[i][j]+ " ");
            }
            
            System.out.println("\n");
        }
        
        // Valor mayor A
        mayor = A[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                if (A[i][j] > mayor) {
                    mayor = A[i][j];
                }
            }
        }
        
        int i = 0;
        int fibo = 0;
        int primero = 0;
        int segundo = 1;
        
        while (fibo<=mayor){
            
            fibo = primero + segundo;
            primero = segundo;
            segundo = fibo;
            i++;
            
        }

        primero = 0;
        segundo = 1;
        
        int [] Fibo = new int [i];
        
        for ( i=0; i<=Fibo.length-1;i++){
            
            Fibo[i] = primero + segundo;
            primero = segundo;
            segundo = Fibo[i];
            
        }
        boolean bandera = false;
        int num = 0;
        
        for ( i=Fibo.length-1; i>=0;i--){
            for (int j=0; j<4; j++){
                for (int k=0; k<6; k++){
                    
                    if (A[j][k]==Fibo[i]&(bandera==false)){
                        
                       num = A[j][k];                    
                       bandera = true; 
                    }
                }
            }
        }  
        System.out.println("El número mayor de la matriz A que pertene a la serie Figonacci es : " +num);
        
        // Valor mayor B
        
        mayor1 = B[0][0];
        
        for (i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                if (B[i][j] > mayor1) {
                    mayor1 = B[i][j];
                }
            }
        }
        
        i = 0;
        fibo = 0;
        primero = 0;
        segundo = 1;
        
        while (fibo<=mayor1){
            
            fibo = primero + segundo;
            primero = segundo;
            segundo = fibo;
            i++;
            
        }

        primero = 0;
        segundo = 1;
        
        int [] Fibo1 = new int [i];
        
        for ( i=0; i<=Fibo1.length-1;i++){
            
            Fibo1[i] = primero + segundo;
            primero = segundo;
            segundo = Fibo1[i];
            
        }
        boolean banderaa = false;
        int nume = 0;
        
        for ( i=Fibo1.length-1; i>=0;i--){
            for (int j=0; j<4; j++){
                for (int k=0; k<6; k++){
                    
                    if (B[j][k]==Fibo1[i]&(banderaa==false)){
                        
                       nume = B[j][k];                    
                       banderaa = true; 
                    }
                }
            }
        }  
        System.out.println("El número mayor de la matriz B que pertene a la serie Figonacci es : " +nume);
    }
}
    
    

