/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adtlistaligada;

/**
 *
 * @author diego
 */
public class PruebasListaLigada {
    public static void main(String[] args) {
        ListaLigada list0 = new ListaLigada(new Nodo(20, new Nodo(50,new Nodo(80))));
        ListaLigada list1 = new ListaLigada(new Nodo());
        System.out.println("Esta Vacía:");
        System.out.println("Lista 1: ");
        System.out.println(list1.estaVacia()); // true
        list1.transversal();
        System.out.println("Tamaño de nodo: "+list1.getTamanio()+"\n");
        System.out.println("Lista 2: ");
        System.out.println(list0.estaVacia()); // false
        list0.transversal();
        System.out.println("Tamaño de nodo: "+list0.getTamanio()+"\n"); // 3
        
        System.out.println("Agregar al Final: 100");
        list0.agregarFinal(new Nodo(100));
        list0.transversal();
        System.out.println("Tamaño de nodo: "+list0.getTamanio()+"\n"); // 4
        
        System.out.println("Agregar al Inicio: 19");
        list0.agregarInicio(new Nodo(19));
        list0.transversal();
        System.out.println("Tamaño de nodo: "+list0.getTamanio()+"\n"); // 1
        
        System.out.println("Agregar Después de 50: 73");
        list0.agregarDespuesDe(new Nodo(50), 73);
        list0.transversal();
        System.out.println("Tamaño de nodo: "+list0.getTamanio()+"\n"); // 2
        
        System.out.println("Eliminar Posición: 4");
        list0.eliminar(4);
        list0.transversal();
        System.out.println("Tamaño de nodo: "+list0.getTamanio()+"\n"); // 4
        
        System.out.println("Eliminar el Primero: ");
        list0.eliminarPrimero();
        list0.transversal();
        System.out.println("Tamaño de nodo: "+list0.getTamanio()+"\n");
        
        System.out.println("Eliminar el Último: ");
        list0.eliminarFinal();
        list0.transversal();
        System.out.println("Tamaño de nodo: "+list0.getTamanio()+"\n");
        
        System.out.println("Buscar: 50");
        System.out.println(list0.buscar(50));
        list0.transversal();
        System.out.println("Tamaño de nodo: "+list0.getTamanio()+"\n");
        
        System.out.println("Actualizar: 50 a 70");
        list0.actualizar(50, 70);
        list0.transversal();
        System.out.println("Tamaño de nodo: "+list0.getTamanio()+"\n");
    }
}
