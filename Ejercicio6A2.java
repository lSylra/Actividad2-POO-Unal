/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6a2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Ejercicio6A2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese 3 Numeros enteros distintos: ");
        int X = input.nextInt();
        int Y = input.nextInt();
        int Z = input.nextInt();
        
        if ((X>Y) && (X>Z)){
            System.out.println(X+" Es el mayor");           
        }
        if ((Y>X) && (Y>Z)){
            System.out.println(Y+" Es el mayor");           
        }
        if ((Z>X) && (Z>Y)){
            System.out.println(Z+" Es el mayor");           
        }
    }
}
