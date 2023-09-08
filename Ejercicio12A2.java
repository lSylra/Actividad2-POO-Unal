/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12a2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Ejercicio12A2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese los valores de A.B,C: ");
        float A = input.nextFloat();
        float B = input.nextFloat();
        float C = input.nextFloat();
        float B2 = (float)Math.pow(B, 2);
        float X1,X2;
  
        X1 = (float)((-B+(Math.sqrt(B2-(4*A*C))))/(2*A));
        X2 = (float)((-B-(Math.sqrt(B2-(4*A*C))))/(2*A));
        
        System.out.println("Los Valores de X son: " + X1+" y "+X2);
    }
}
