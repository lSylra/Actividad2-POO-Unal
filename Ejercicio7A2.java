/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7a2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Ejercicio7A2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el nombre del trabajador: ");
        String Nombre = input.next();
        System.out.print("Ingrese las horas trabajadas: ");
        int Hora = input.nextInt();
        System.out.print("Ingrese el valor de la hora ");
        int Valor = input.nextInt();
        float Salario;
        
        if (Hora<=40){
            Salario = Hora*Valor;
        }
        else if (Hora<=48){
            Hora = Hora-40;
            Salario = 40*Valor;
            Salario = Salario + ((Hora*2)*Valor);
        }
        else{
            Hora = Hora-48;
            Salario = (40*Valor)+(16*Valor);
            Salario = Salario + ((Hora*3)*Valor);
        }
        System.out.println("Nombre: " + Nombre);
        System.out.println("Salario: " + Salario);
    }
}
