/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_factorial;

/**
 *
 * @author Hogar
 */
public class Eva2_9_Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Factorial de 5: " + factorial(5));
        System.out.println("Factorial de 5 (recursivo): " + factorialRecu(5));
    }

    public static int factorial(int n) {
        int f = 1;
        for(int i = n; i >= 1; i--) {
            f *= i;
        }
        return f;
    }

    public static int factorialRecu(int n) {
        if(n == 0) {
            return 1;
        } else {
            return n * factorialRecu(n - 1); 
        }
    }
    
}
