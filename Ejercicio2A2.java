/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2a2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Ejercicio2A2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el Valor de los lados del triangulo:");
        float Valor = input.nextFloat();
        
        float Perimetro = Valor+Valor+Valor;
        float Altura = (float) Math.sqrt(Math.pow(Valor, 2) - Math.pow((Valor/2), 2));
        float Area = (Altura*Valor)/2;
        
        System.out.println("El perimetro del triangulo es " + Perimetro);
        System.out.println("La altura del triangulo es " + Altura);
        System.out.println("El Area del triangulo es " + Area);
    }
}
