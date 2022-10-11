/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adtlistaligada;

/**
 *
 * @author diego
 */
public class PruebasNodo {
    public static void main(String[] args) {
        Nodo<Integer> head = new Nodo(10);
        head.setSiguiente(new Nodo(20,null));
        head.getSiguiente().setSiguiente(new Nodo(30));
        System.out.println( head.getSiguiente().getSiguiente().getDato());
        head.getSiguiente().getSiguiente().setSiguiente(new Nodo(5,new Nodo(6)));
        Nodo<Integer> aux = head;
        while (aux.getSiguiente() != null) {
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(new Nodo(7));
        
        aux = head;
        System.out.println("Transversal...");
        while (aux != null) {
            System.out.print(aux);
            aux = aux.getSiguiente();
        }
        System.out.println();
        
        Nodo<Integer> prueba = new Nodo(20, new Nodo(50));
        System.out.println(prueba.getSiguiente().getSiguiente());
    }
}
