/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martin
 */
public class Suma {
    private int vUno, vDos, resultado;
    
    public Suma(int valor1, int valor2){
        this.vUno = valor1;
        this.vDos = valor2;
    }
    public void Operacion(){
        resultado = vUno + vDos;
        }
    public void Imprimir(){
     Operacion();
        System.out.println("El resultado es: "+resultado);
    }
}
