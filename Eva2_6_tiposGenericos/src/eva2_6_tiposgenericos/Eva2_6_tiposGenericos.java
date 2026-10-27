/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_tiposgenericos;

/**
 *
 * @author Hogar
 */
public class Eva2_6_tiposGenericos {

    public static void main(String[] args) {
        //int ---> integer,double ---> Double
        Ejemplo <Double> prueba = new Ejemplo<Double>();
    }
    
}

class Ejemplo <T>{
    private T dato;
    
    public Ejemplo(){
    
    }
    
    public Ejemplo(T dato){
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    
    
}