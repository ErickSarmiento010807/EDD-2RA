/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_lista_doble;

/**
 *
 * @author Hogar
 */
public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    private int longitud;
    
    public ListaDoble(){
        inicio = null;
        fin = null;
        longitud = 0;
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
    
    public void imprimirInv(){
        Nodo temp = fin;
      while (temp != null){
         System.out.print("["+ temp.getValor()+"]");
         temp = temp.getPrevio();
      }
      System.out.println("");

    }
    
    public int longitud(){
        return longitud;
    }

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
      if(posicion < 0 || posicion > longitud()){
         throw new RuntimeException("La posicion " +  posicion + " no es valida!");
      }
      Nodo nuevo = new Nodo(valor);
      if(posicion == 0){
         nuevo.setSiguiente(inicio);
         if(inicio != null){
            inicio.setPrevio(nuevo);
         }
         inicio = nuevo;
         if(fin == null){
            fin = nuevo;
         }
      }else if(posicion == longitud()){
         fin.setSiguiente(nuevo);
         nuevo.setPrevio(fin);
         fin = nuevo;
      }else{
         Nodo temp = inicio;
         for (int i = 0; i < posicion - 1; i++) {
            temp = temp.getSiguiente();
         }
         Nodo siguiente = temp.getSiguiente();
         nuevo.setSiguiente(siguiente);
         nuevo.setPrevio(temp);
         temp.setSiguiente(nuevo);
         siguiente.setPrevio(nuevo);
      }
      longitud++;
   }
    
    public void borrarEn (int posicion){
      if (posicion < 0 || posicion >= longitud()) {
         throw new RuntimeException("la posicion " + posicion + " no es valida para borrar");
      }
      if (posicion == 0) {
         inicio = inicio.getSiguiente();
         if (inicio != null) {
            inicio.setPrevio(null);
         } else {
            fin = null;
         }
      } else {
         Nodo temp = inicio;
         for (int i = 0; i < posicion; i++) {
            temp = temp.getSiguiente();
         }
         Nodo previo = temp.getPrevio();
         Nodo siguiente = temp.getSiguiente();
         previo.setSiguiente(siguiente);
         if (siguiente != null) {
            siguiente.setPrevio(previo);
         } else {
            fin = previo;
         }
      }
      longitud--;
   } 
}
