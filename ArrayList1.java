/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Earraylist1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author jalonsoriveiro
 */
public class ArrayList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obx = new Metodos();
        ArrayList<Integer> listaNumeros = new ArrayList();
        
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(2);
        listaNumeros.add(5);
        listaNumeros.add(5);
        listaNumeros.add(3);
        listaNumeros.add(2);
        //Cambiar elementos
        listaNumeros.set(2, 3);
        //Eliminar elemento
        listaNumeros.remove(2);        
        //eliminar elemento por su valor
        listaNumeros.remove(new Integer(5));
        
        //cambio valor sen posicion
        //listaNumeros.indexOf(new Integer(5));        
        listaNumeros.set(listaNumeros.indexOf(new Integer(5)), 7);
        //ordenar
        Collections.sort(listaNumeros);
        
        
        
        
        obx.amosar(listaNumeros);
        
        
    }
    
}
