/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebahash;

/**
 *
 * @author diego
 */
public class PruebaHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashTableADT hash = new HashTableADT(13);
        System.out.println("Tabla Hash: ");
        hash.add(236, "José");
        hash.add(526, "A");
        hash.add(313, "B");
        hash.add(29, "C");
        hash.add(187, "D");
        hash.add(435, "E");
        System.out.println(hash);
        System.out.println("\nFunción valueOf: ");
        hash.valueOf(236);
        System.out.println("\nFunción Remove: ");
        hash.remove(313);
        System.out.println(hash);
    }   
}