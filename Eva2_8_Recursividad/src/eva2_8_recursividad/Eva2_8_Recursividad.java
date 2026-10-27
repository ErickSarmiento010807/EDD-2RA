/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_recursividad;

/**
 *
 * @author Hogar
 */
public class Eva2_8_Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        imprimirCiclo(5);
        imprimirRecu(5);
    }

    public static void imprimirCiclo(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " - ");
        }
        System.out.println("");
    }

    public static void imprimirRecu(int n) {
        System.out.print(n + " - ");
        if(n > 1) { 
            imprimirRecu(n - 1);
        }
    }
    
}
