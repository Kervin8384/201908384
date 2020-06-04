/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1_ht1;

import java.util.Scanner;

/**
 *
 * @author kervin
 */
public class IPC1_HT1 {
   
    public static int contadorA = 1;
    public static int contadorB = 1;
    public static String[] SeccionA = new String[contadorA];
    public static String[] SeccionB = new String[contadorB];
    public static Scanner lectura = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        VerificarAsignados();
        Asignarse();
        
        
    }
    
    public static void VerificarAsignados(){
        if (SeccionA.length < 15 || SeccionB.length < 15){
            if (SeccionA.length <15){
                System.out.println("Usted puede asignarse a la seccion A");
            }
            if (SeccionB.length < 15){
                System.out.println("Usted puede asignarse a la seccion B");
            }
        }else {
            System.out.println("Las secciones estan llenas, intente abrir una nueva");
        
        }
        
    
    }
    
    public static void VerificarA(){
        if (SeccionA.length < 15) {
            System.out.println("Usted esta asignado a la Seccion A");
        }else {
            System.out.println("Esta seccion esta llena");        
        }
    
    }
    
    public static void VerificarB(){
        if (SeccionB.length < 15) {
            System.out.println("Usted esta asignado a la Seccion B");
        }else {
            System.out.println("Esta seccion esta llena");        
        }
    
    }
    
    public static void Asignarse(){
        System.out.println("Ingrese la seccion a la que desea asignarse");
        System.out.println("1. Seccion A");
        System.out.println("2. Seccion B");
        int respuesta = lectura.nextInt();
        
        switch(respuesta){
            case 1: {
                VerificarA();
                AsignarA();
                break;               
            }
                
            case 2: {
                VerificarB();
                AsignarB();    
                break;               
            }
            
            default:{         
            
            }     
 
        }
    
    }
    
    public static void AsignarA(){
        System.out.println("Ingrese su carnet");
        String carnet = lectura.next();
        int contadorA2 = 0;
        SeccionA[contadorA2] = carnet;
        contadorA = contadorA + 1;
        
    
    }
    
    public static void AsignarB(){
        System.out.println("Ingrese su carnet");
        String carnet = lectura.next();
        int contadorB2 = 0;
        SeccionB[contadorB2] = carnet;
        contadorB++;
    
    }
            
    
}
