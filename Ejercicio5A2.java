/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5a2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Ejercicio5A2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el numero de inscripcion: ");
        String Numero = input.next();
        System.out.print("Ingrese el Nombre: ");
        String Nombre = input.next();
        System.out.print("Ingrese el Patrimonio: ");
        int Patrimonio = input.nextInt();
        System.out.print("Ingrese el Estrato social: ");
        byte Estrato = input.nextByte();
        int Matricula = 50000;
        
        if (Estrato>3){
            if (Patrimonio>2000000){
                Matricula = Matricula + ((Patrimonio*3)/100);
            }
            
        }
            
        System.out.println("Numero de Inscripcion: " + Numero);
        System.out.println("Nombre del admitido: " + Nombre);
        System.out.println("Valor de la matricula: " + Matricula);
            
                    
    }
}       
    
        
        
    

