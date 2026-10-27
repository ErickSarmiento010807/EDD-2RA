/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_queue;

/**
 *
 * @author Hogar
 */
public class EVA2_4_QUEUE {

    
    public static void main(String[] args) {
        Myqueues queue = new Myqueues();
        
        //Agregar elementos a la cola
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        
        //Mostrar la cola
        System.out.println("cola: ");
        queue.imprimir();
        
        //primer elemento sin eliminar
        System.out.println("primer elemento: " + queue.peek());
        
        //eliminar el primer elemento y mostrar el valor
        System.out.println("Elemento borrado: " + queue.pop());
        
        //Mostrar la cola despues de borrar un elemento
        System.out.println("Cola despues de eliminar un elemento: ");
        queue.imprimir();
    }
    
}
