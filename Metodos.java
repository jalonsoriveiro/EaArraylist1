/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Earraylist1;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;
import java.util.*;



/**
 *
 * @author jalonsoriveiro
 */
import static java.util.Spliterators.iterator;
public class Metodos {
    //Distintos xeitos de percorrer unha coleccion
    public void amosar(ArrayList<Integer>lista){
    
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
            
    }
    
public void amosarForEach(ArrayList<Integer>lista){
    System.out.println("for each");
    for(Integer ele:lista){
            
        System.out.println(ele);
}
    
}    
    //utilizando iteradores
    public void amosarIteradores(ArrayList<Integer>lista){
            Iterator it=lista.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
                /*Tamen se pode facer asi
                int valor = (Integer)it.next();
                System.out.println(valor);*/
            }
                
                
    }   
    public void ver(ArrayList<Integer>lista){    
        System.out.println(lista);
        
    }
}
