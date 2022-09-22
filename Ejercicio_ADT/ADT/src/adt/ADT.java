/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adt;

/**
 *
 * @author diego
 */
public class ADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConjuntoADT<Integer> conjunto1 = new ConjuntoADT<>();
        ConjuntoADT<Integer> conjunto2 = new ConjuntoADT<>();
        conjunto1.agregar(10);
        conjunto1.agregar(200);
        conjunto2.agregar(10);
        conjunto2.agregar(200);
        conjunto2.agregar(250);
        
        System.out.print("¿Los conjuntos son iguales?: ");
        System.out.println(conjunto1.equals(conjunto2.getArray()));
        
        System.out.print("Longitud del conjunto: ");
        System.out.println(conjunto1.longitud());
        
        conjunto1.agregar(10);
        System.out.print("El conjunto contiene: ");
        System.out.print(conjunto1.contiene(200));
        
        conjunto1.eliminar(10);
        System.out.println();
        System.out.print("Longitud del conjunto: ");
        System.out.println(conjunto1.longitud());
        conjunto1.agregar(300);
        conjunto1.agregar(15);
        
        System.out.print("Unión:");
        conjunto1.union(conjunto2.getArray());
        System.out.print("Intersección: ");
        conjunto1.interseccion(conjunto2.getArray());
        System.out.print("Diferencia: ");
        conjunto1.diferencia(conjunto2.getArray());
        
        ConjuntoADT<Integer> conjunto3 = new ConjuntoADT<>();
        ConjuntoADT<Integer> conjunto4 = new ConjuntoADT<>();
        
        conjunto3.agregar(1);
        conjunto3.agregar(5);
        conjunto3.agregar(10);
        
        conjunto4.agregar(1);
        conjunto4.agregar(5);
        conjunto4.agregar(10);
        conjunto4.agregar(12);
        conjunto4.agregar(17);
        
        System.out.print("Subconjunto: ");
        System.out.println(conjunto3.esSubConjunto(conjunto4.getArray()));
        
        System.out.println("Iterador: ");
        conjunto4.iterador();

    }
}