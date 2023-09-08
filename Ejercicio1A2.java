/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1.a2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Ejercicio1A2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el Codigo del empleado:");
        int Codigo = input.nextInt();
        System.out.print("Ingrese el Nombre del empleado:");
        String Nombre = input.next();
        System.out.print("Ingrese el Numero de horas trabajadas en el mes:");
        int Horas = input.nextInt();
        System.out.print("Ingrese el Valor de la hora:");
        float Valor = input.nextFloat();
        System.out.print("Ingrese la retencion en la fuente:");
        float Fuente = input.nextFloat();
        
        float SalarioBruto = Horas*Valor;
        float Retencion = (SalarioBruto*Fuente)/100;
        float SalarioNeto = SalarioBruto-Retencion;
        
        System.out.println("Codigo: " + Codigo);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Salario Bruto; " + SalarioBruto);
        System.out.println("Salario Neto: " + SalarioNeto);
    }
}
