/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8a2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Ejercicio8A2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el Valor de la compra: ");
        float Valor = input.nextFloat();
        System.out.print("Ingrese el Color de la bolita: ");
        String Color = input.next();
        
        if (Color.equals("Verde")){
            Valor = Valor*(float)0.90;
        }
        else if (Color.equals("Amarilla")){
            Valor = Valor*(float)0.75;
        }
        else if (Color.equals("Azul")){
            Valor = Valor/2;
        }
        else if (Color.equals("Roja")){
            Valor = 0;
        }
        System.out.println("El valor de la compra es: " + Valor);
    }
}
