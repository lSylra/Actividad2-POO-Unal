/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio13a2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Ejercicio13A2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el peso de las 3 esferas: ");
        float Peso1 = input.nextFloat();
        float Peso2 = input.nextFloat();
        float Peso3 = input.nextFloat();
        
        if ((Peso1>Peso2) && (Peso1>Peso3)){
            System.out.println(Peso1+" Es el mayor");           
        }
        if ((Peso2>Peso1) && (Peso2>Peso3)){
            System.out.println(Peso2+" Es el mayor");           
        }
        if ((Peso3>Peso1) && (Peso3>Peso2)){
            System.out.println(Peso3+" Es el mayor");           
        }
    }
}
