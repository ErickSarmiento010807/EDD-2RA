/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_lista_simple;

/**
 *
 * @author Hogar
 */
public class ListaSimple {
    private Nodo inicio;
    private Nodo fin;
    private int longitud = 0;
    
    public ListaSimple(){
        inicio = null;
        fin = null;
    }
    //SIEMPRE SE AGREGA AL FINAL DE LA LISTA
    //O
    public void agregar(int valor){
        Nodo nuevo = new Nodo(valor);//crear el nodo para el valor a insertar
        //Y LUEGO??
        if(inicio == null){//LISTA VACIA? VERDADERO
            inicio = nuevo; //nuevo es el primer nodo de la lista
            fin = nuevo;
        }else{//Lista con nodos
            //movernos al final
           /* Nodo temp = inicio;
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();   
            }
            temp.setSiguiente(nuevo);*/
           fin.setSiguiente(nuevo);
           fin = nuevo;
        }
        longitud++;
    }
    //O(N)
    public void imprimir(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.print("[" + temp.getDato() + "]");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
    
    public int longitud(){
        return longitud;
    }
    //O(N)
    /*public int longitud(){
        int cont = 0;
        Nodo temp = inicio;
        while (temp != null){
            cont++;
            temp = temp.getSiguiente();
        }
        return cont;
    }*/
    
    //O(1)
    public boolean listaVacia(){
        if(inicio == null){//LISTA VACIA? VERDADERO
            return true;
        }else{
            return false;
        }
    }
    
    //O(1)
    public void vaciarLista(){
        inicio = null;
        fin = null;
        longitud = 0;
    }
    //Validar: posicion tenga un valor Valido
                                        //throws
    public int valorEn (int posicion) {
        //excepción
        //Validar posicion
        int tama = longitud;
        if(posicion >= 0 && posicion < tama){
        //1 que posiciones son válidas? de 0 (cero) a N - 1 (N es la cantidad de nodos)
        Nodo temp = inicio;
            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
            return temp.getDato();
        }else{
            throw new RuntimeException("La posicion " + posicion + "no es valida!!");
        
        }
    }
    
    //Regresa la primer aparicion del valor en la lista
    //regresa la posicion
    //O(??)
    
    public int encontrar (int valor){
        Nodo temp = inicio;
        int i = 0;
        
        while (temp != null){
            if (temp.getDato() == valor){
                return i;
            }temp = temp.getSiguiente();
            i++;
        }return -1;
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
    
    //Imprimir imprimir
    public void invertir(){
        int tama = longitud;
        for (int i = tama - 1; i >= 0; i--) {
            System.out.print("[" + valorEn(i) + "]");
        }
        System.out.println("");
    }
    
}   

