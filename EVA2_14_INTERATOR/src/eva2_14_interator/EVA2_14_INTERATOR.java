/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_interator;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Hogar
 */
public class EVA2_14_INTERATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> lista = new LinkedList<>();
        /*lista.add(100);
        lista.add(100);
        lista.add(100);
        lista.add(100);
        lista.add(100);
        */
        for (int i = 0; i < 100000; i++) {
            lista.add((int)(Math.random() * 1000));
            
        }
        System.out.println("cantidad de nodos: " + lista.size());
        
        /*int promedio = 0;
        for (int i = 0; i < 100000; i++) {
            promedio += lista.get(i);
        }
        System.out.println("Sumatoria: " + promedio);*/
        Iterator<Integer> iterador = lista.descendingIterator();
        int promedio = 0;
        while(iterador.hasNext()){
            promedio += iterador.next();
        }
        System.out.println("Sumatoria = " + promedio);
        System.out.println("promedio = " + (promedio / 100000.0));
        
    }
    
}
