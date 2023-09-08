/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10a2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Ejercicio10A2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el peso de las esferas: ");
        float Peso1 = input.nextFloat();
        float Peso2 = input.nextFloat();
        float Peso3 = input.nextFloat();
        float Peso4 = input.nextFloat();
        
        if ((Peso1==Peso2)&&(Peso1==Peso3)){
            if (Peso4>Peso1){
                System.out.println(Peso4 + " Es mayor al resto");
            }
            else{
                System.out.println(Peso4 + " Es menor al resto");
            }
        }
        if ((Peso1==Peso2)&&(Peso1==Peso4)){
            if (Peso3>Peso1){
                System.out.println(Peso3 + " Es mayor al resto");
            }
            else{
                System.out.println(Peso3 + " Es menor al resto");
            }
        }
        if ((Peso1==Peso3)&&(Peso1==Peso4)){
            if (Peso2>Peso1){
                System.out.println(Peso2 + " Es mayor al resto");
            }
            else{
                System.out.println(Peso2 + " Es menor al resto");
            }
        }
        if ((Peso2==Peso3)&&(Peso2==Peso4)){
            if (Peso1>Peso2){
                System.out.println(Peso1 + " Es mayor al resto");
            }
            else{
                System.out.println(Peso1 + " Es menor al resto");
            }
        }
    }
}
