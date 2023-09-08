/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11a2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Ejercicio11A2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String Nombre = input.next();
        System.out.print("Ingrese el salario basico por hora: ");
        int Valor = input.nextInt();
        System.out.print("Ingrese las horas trabajadas: ");
        int Hora = input.nextInt();
        int Salario = Valor*Hora;
        
        System.out.println("Nombre: " + Nombre);
        if (Salario>=450000){
            System.out.println("Salario: " + Salario);
        }
    }
}
