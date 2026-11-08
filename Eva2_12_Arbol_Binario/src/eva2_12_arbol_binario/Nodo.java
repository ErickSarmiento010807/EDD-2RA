/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_12_arbol_binario;

/**
 *
 * @author Hogar
 */
public class Nodo {
    //Dos atributos
    private int valor;
    private Nodo derecha;
    private Nodo izquierda;
    //Constructores:
    
    public Nodo() {
        derecha = null; //ESTO ES MUY IMPORTANTE
    }
    
    public Nodo (int valor) {//Poner el valor a guardar, al momento de crar el nodo
        this.valor = valor;
        derecha = null;
         
    }
    //get y set

    public int getDato() {
        return valor;
    }

    public void setDato(int valor) {
        this.valor = valor;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
    
    
}
