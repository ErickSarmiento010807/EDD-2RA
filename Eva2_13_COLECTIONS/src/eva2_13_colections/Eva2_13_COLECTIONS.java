/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_colections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Hogar
 */
public class Eva2_13_COLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(100);
        lista.add(200);
        lista.add(300);
        lista.add(400);
        lista.add(500);
        System.out.println("Elementos en la lista: ");
        System.out.println("Elementos en la lista: " + lista);
        System.out.println("Tamaño en la lista: " + lista.size());
        
        lista.clear();
        System.out.println("Elementos en la lista Despues de el clear: " + lista);
        
        System.out.println("");
        
        //ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hola");
        arrayList.add("");
        arrayList.add("Mundo");
        arrayList.add("!!!!");
        
        System.out.println("Elemento en el ArrayList: " + arrayList);
        System.out.println("Tamaño del ArrayList: " + arrayList.size());
        
        System.out.println("");
        
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(100);
        queue.add(200);
        queue.add(300);
        queue.add(400);
        queue.add(500);
        
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue);
        
    }
    
}
