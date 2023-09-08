/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4a2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Ejercicio4A2 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Ingrese 2 Numeros: ");
       int X = input.nextInt();
       int Y = input.nextInt();
       
       if (X>Y){
           System.out.println(X +" es mayor a " + Y);
       }
       if (Y>X){
           System.out.println(Y +" es mayor a " + X);
       }
       if (X==Y){
           System.out.println(X +" es igual a " + Y);
       }    
    }
}