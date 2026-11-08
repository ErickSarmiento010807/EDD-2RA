/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_12_arbol_binario;

/**
 *
 * @author Hogar
 */
public class ArbolBinario {
    private Nodo root;
    
    public ArbolBinario(){
        root = null;
    }
    
    public void agregar(int valor){
        if(root == null){
            root = new Nodo(valor);
        }else{
            agregarRecu(root, valor);
        }
    }
    
    private void agregarRecu(Nodo actual, int valor){
        if(valor > actual.getValor()){//A la derecha
            if(actual.getDerecha()!= null){
                agregarRecu(actual.getDerecha(),valor);
            }else{
                actual.setDerecha(new Nodo(valor));
            }
        }else if(valor < actual.getValor()){//A la izquierda 
            if(actual.getIzquierda()!= null){
                agregarRecu(actual.getIzquierda(),valor);
            }else{
                actual.setIzquierda(new Nodo(valor));
            }
        }
    }/*else ---> el valor esta repetido */
    
    public void preOrder(){
        preOrderRecu(root);
    }
    
    private void preOrderRecu(Nodo actual){
        if(actual != null){
            System.out.print(actual.getValor() + " - ");
            preOrderRecu(actual.getIzquierda());//leer el lado izq
            preOrderRecu(actual.getDerecha());//leer el lado izq
        }
    }
    
    public void postOrder(){
        postOrderRecu(root);
    }
    
    private void postOrderRecu(Nodo actual){
        if(actual != null){
            postOrderRecu(actual.getIzquierda());//leer el lado izq
            postOrderRecu(actual.getDerecha());//leer el lado izq
            System.out.print("");
            System.out.print(actual.getValor() + " - ");
        }
    }
    
    public void inOrder(){
        inOrderRecu(root);
    }
    
    private void inOrderRecu(Nodo actual){
        if (actual.getIzquierda() != null) {
            inOrderRecu(actual.getIzquierda());
        }
        if (actual.getDerecha() != null) {
            inOrderRecu(actual.getDerecha());
        }
        System.out.print(actual.getValor() + " - ");
    }
}
