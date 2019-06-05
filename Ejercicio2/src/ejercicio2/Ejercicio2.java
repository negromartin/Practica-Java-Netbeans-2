/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;



public class Ejercicio2 {
    
    public static void main(String[] args) {
        String palabra = "", palabrainversa = "";
        int tamaño = 0;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la palabra a invertir:  ");
        palabra = entrada.nextLine();
        tamaño = palabra.length();
        for(int tamaño2 = tamaño - 1; tamaño2 >= 0; tamaño2--){
        palabrainversa += palabra.substring(tamaño2,tamaño);
            tamaño--;
        }
        System.out.println("Palabra invertida "+ palabrainversa); 
    }
    
}
