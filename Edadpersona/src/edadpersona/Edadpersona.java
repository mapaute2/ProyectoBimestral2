/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edadpersona;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Edadpersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        
        //Declaracion e inicializacion de variables
        int MesActual, AñoActual, DiaNacimiento, MesNacimiento, AñoNacimiento,DiaActual, edadMeses, edadAños, edadDia;
        
        DiaActual = 1; MesActual = 1; AñoActual = 1; DiaNacimiento = 1; MesNacimiento = 1; AñoNacimiento = 1; 
        edadAños = 1; edadMeses = 1; edadDia = 1; 
        
        System.out.println(" Programa para determinar la edad de una persona en año, mes y día ");
        
       // Ingresar los datos de entrada
       
        System.out.println(" Escribe la fecha actual en día, mes y año ");
        DiaActual = leer.nextInt();
        MesActual = leer.nextInt();
        AñoActual = leer.nextInt();
        
        System.out.println(" Escribe la fecha de nacimiento en día, mes y año ");
        DiaNacimiento = leer.nextInt();
        MesNacimiento = leer.nextInt();
        AñoNacimiento = leer.nextInt();
     
        edadDia = DiaActual - DiaNacimiento;
        edadMeses = MesActual - MesNacimiento;
        edadAños = AñoActual - AñoNacimiento;
        
        // Proceso
        
        if (edadDia < 0){
            edadMeses = edadMeses - 1;
            edadDia = edadDia + 30;
        }
        if (edadMeses < 0){
            edadAños = edadAños - 1;
            edadMeses = edadMeses + 12;
        }
        
        // Salida de resultados 
        
        System.out.println(" Tu edad es: " +edadAños + " años con " +edadMeses + " meses y " +edadDia + " días ");
    }
    
}
