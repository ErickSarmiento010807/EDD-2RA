/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_lista_doble;

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
    }
    
    public Nodo (int valor) {//Poner el valor a guardar, al momento de crar el nodo
        this.valor = valor;
        siguiente = null;
         
    }
    //get y set

    public int getDato() {
        return valor;
    }

    public void setDato(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
    
}
