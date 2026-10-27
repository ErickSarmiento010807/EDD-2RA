/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_stack;

/**
 *
 * @author Hogar
 */
public class Nodo {
    //Dos atributos
    private int valor;
    private Nodo siguiente;
    private Nodo previo;
    //Constructores:
    
    public Nodo() {
        siguiente = null; //ESTO ES MUY IMPORTANTE
        previo = null;
    }
    
    public Nodo (int valor) {//Poner el valor a guardar, al momento de crar el nodo
        this.valor = valor;
        this.siguiente = null;
        this.previo = null;
    }
    //get y set

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }
    
    
}
