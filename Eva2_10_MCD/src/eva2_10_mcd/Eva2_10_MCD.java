/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_mcd;

/**
 *
 * @author Hogar
 */
public class Eva2_10_MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("El MCD de 48 y 18 es: " + mcd(48, 18));
    }

    public static int mcd(int a, int b) {
        if ((a%b) == 0) {
            return b; 
        } else {
            System.out.println(((int)(a%b)));
            return mcd(b, (a % b)); 
        }
    }
    
}
