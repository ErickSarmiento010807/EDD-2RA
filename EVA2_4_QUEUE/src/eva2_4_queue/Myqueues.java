/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_queue;

/**
 *
 * @author Hogar
 */
public class Myqueues {
    private Nodo inicio;
    private Nodo fin;
    private int longitud;
    
    public Myqueues(){
        inicio = null;
        fin = null;
        longitud = 0;
    }
    
    //O(N)
    public void imprimir(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
    
    public void imprimirInv(){
        Nodo temp = fin;
        while(temp != null){
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
    
    public int longitud(){
        return longitud;
    }

    //O(1)
    public boolean listaVacia(){
        return inicio == null;
    }
    
    //O(1)
    public void vaciarLista(){
        inicio = null;
        fin = null;
        longitud = 0;
    }
    
    public void agregar(int valor){
        Nodo nuevo = new Nodo(valor);//crear el nodo para el valor a insertar
        //Y LUEGO??
        if(inicio == null){//LISTA VACIA? VERDADERO
            inicio = nuevo; //nuevo es el primer nodo de la lista
            fin = nuevo;
        }else{
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
        }
        this.longitud++;
    }   
    
    public void insertarEn(int valor, int posicion){
        if(posicion < 0 || posicion > longitud){
            throw new RuntimeException("La posicion " +  posicion + "no es valida!");
        }else{
            Nodo nuevo = new Nodo(valor);
            if(posicion == 0){
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
                if(fin == null){
                    fin = nuevo;
                }
            }else if(posicion == longitud){
                fin.setSiguiente(nuevo);
                fin = nuevo;
            }else{
                Nodo temp = inicio;
                for (int i = 0; i < posicion - 1; i++) {
                    temp = temp.getSiguiente();
                }
                nuevo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevo);
            }
        }
        longitud++;
    }
    
    public void borrarEn (int posicion){
        if (posicion < 0 || posicion >= longitud) {
            throw new RuntimeException("la posicion " + posicion + "no es valida para borrar");
        }
        if (posicion == 0) {
            inicio = inicio.getSiguiente();
            if (inicio == null) {
                fin = null;
            }
        }
        else{
            Nodo temp = inicio;
            for (int i = 0; i < posicion - 1; i++) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(temp.getSiguiente().getSiguiente());
            if (temp.getSiguiente() == null) {
                fin = temp;
            }
        }
        longitud--;
    }
    
    public int valorEn(int posicion) {
        if(posicion < 0 || posicion >= this.longitud) {
            throw new IndexOutOfBoundsException("Posicion no valida");
        } else{
            Nodo temp = inicio;
            for( int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
            return temp.getValor();
        }
    }
    
    //QUEUE --> FIFO (PRIMERO EN LLEGAR PRIMERO EN SALIR)
    //AGREGA UN VALOR AL FINAL DE LA LISTA
    public void push(int valor) {
        agregar(valor);
    }

    //LEE EL VALOR DIRECAMENTE ACCESIBLE, SIN BORRARLO
    public int peek() {
        if (listaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return valorEn(0); //devuelve el valor del primer nodo de la lista
    }

    //LEE EL VALOR DIRECAMENTE ACCESIBLE, Y LO BORRA
    public int pop() {
        if (listaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int valor = valorEn(0);
        borrarEn(0);
        return valor;
    }
}
