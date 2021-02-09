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
public class EjercicioN4 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int n = 0;
        
        System.out.println("Ingrese el limite");
        n = leer.nextInt();
        
        int TP [][] = new int [n][n];
        
        for (int i=0; i<n;i++){
            for (int j=0; j<=i; j++){
                
                if ((j==0)||(j==i)){
                    
                    TP[i][j] = 1;
                    
                }
                else{
                    
                    TP[i][j]= TP[i-1][j-1] + TP[i-1][j];
                }
            }
            
        }
        int espacio = 0;
        
        for (int i=n-1; i>=0;i--){
            for (int k=0; k<espacio; k++){
                
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++){
               
                    
                System.out.print(TP[i][j]+ " ");
                
            }
            System.out.println(" ");
            espacio++;
        }
        
        int A[][] = new int [n][n];
        
        espacio = 0;
        int k = 0;

        for (int i=n-1; i>=0;i--){ 
            int l = espacio;
            for (int j=0; j<=i; j++){
                  
                A[k][l] = TP[i][j];
                l++;      
                
            }
            espacio ++;
            k++;
        }
        espacio = 0;
        for (int i=0; i<n;i++){
            for ( k=0; k<espacio; k++){
                
                System.out.print(" ");
            }
            for (int j=0; j<n; j++){
                
                if(A[i][j]!=0){
                    
                    System.out.print(A[i][j]+" ");
                }
            }
            espacio ++;
            System.out.println(" ");
        }
        
    } 
}
