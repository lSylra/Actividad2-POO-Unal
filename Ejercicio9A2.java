/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9a2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Ejercicio9A2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de ventas de los 3 departamentos: ");
        int Ventas1 = input.nextInt();
        int Ventas2 = input.nextInt();
        int Ventas3 = input.nextInt();
        System.out.print("Ingrese el Salario de los departamentos: ");
        int  Salario = input.nextInt();
        int  Salario1;
        int  Salario2;
        int  Salario3;
        int Total = Ventas1 + Ventas2 + Ventas3;
        
        if (Ventas1>Total*33/100){
            Salario1 = Salario+(Salario*20/100);
        }
        else{
            Salario1 = Salario;
        }
        if (Ventas2>Total*33/100){
            Salario2 = Salario+(Salario*20/100);
        }
        else{
            Salario2 = Salario;
        }
        if (Ventas3>Total*33/100){
            Salario3 = Salario+(Salario*20/100);
        }
        else{
            Salario3 = Salario;
        }
        System.out.println("El Salario del departamento 1 es: " + Salario1);
        System.out.println("El Salario del departamento 2 es: " + Salario2);
        System.out.println("El Salario del departamento 3 es: " + Salario3);
    }
}
