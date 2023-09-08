/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3a2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Ejercicio3A2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingreser los lados del triangulo: ");
        float Lado1 = input.nextFloat();
        float Lado2 = input.nextFloat();
        float Lado3 = input.nextFloat();
        
        float Perimetro = Lado1+Lado2+Lado3;
        float S = Perimetro/2;
        float Area = (float) Math.sqrt(S*(S-Lado1)*(S-Lado2)*(S-Lado3));
        
        System.out.println("El perimertro del triangulo es " + Perimetro);
        System.out.println("El Semi Perimetro del triangulo es " + S);
        System.out.println("El Area del triangulo es " + Area);
    }
}
