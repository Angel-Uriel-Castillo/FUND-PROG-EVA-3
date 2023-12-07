/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3;

/**
 *
 * @author uriel
 */
public class EVA3 {

    public static void main(String[] args) {
        //llamaada funvion (invocar funcion)
        //utrilizar el valor directamente de la funcion
        System.out.println(buscarMaximo (100,200));
        //guardar el valor en na varibale
        int resu= buscarMaximo (100,200);
        System.out.println(resu);
        //llamar a la funcion e ignorar el resultado
        buscarMaximo(100,200);
        
        
    }
    public static int buscarMaximo(int val1, int val2){
        /*if(val1 > val2)
            return val1;
        else
            return val2;*/
        
        int resultado;
        if(val1 > val2)
            resultado =val1;
        else
            resultado =val2;
        
        return resultado;
    } 
    
}
