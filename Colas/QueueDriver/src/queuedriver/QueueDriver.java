/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queuedriver;

/**
 *
 * @author diego
 */
public class QueueDriver {
    public static void main(String[] args) {
        QueueADT<String> cola = new QueueADT<>();
        cola.enqueue("Angela");
        cola.enqueue("Juan");
        cola.enqueue("Diego");
        System.out.println(cola);
        System.out.println("¿Está vacía?: " + cola.is_empty());
        System.out.println("¿Cuántos elementos tiene?: " + cola.length()+"\n");
        cola.dequeue();
        System.out.println(cola);
        System.out.println("¿Está vacía?: " + cola.is_empty());
        System.out.println("¿Cuántos elementos tiene?: " + cola.length()+"\n");
        cola.dequeue();
        System.out.println(cola);
        System.out.println("¿Está vacía?: " + cola.is_empty());
        System.out.println("¿Cuántos elementos tiene?: " + cola.length()+"\n");
        cola.dequeue();
        System.out.println(cola);
        System.out.println("¿Está vacía?: " + cola.is_empty());
        System.out.println("¿Cuántos elementos tiene?: " + cola.length()+"\n");
        cola.enqueue("Sofía");
        cola.enqueue("Alberto");
        cola.enqueue("Elizabeth");
        System.out.println(cola);
        System.out.println("¿Está vacía?: " + cola.is_empty());
        System.out.println("¿Cuántos elementos tiene?: " + cola.length()+"\n");
        cola.dequeue();
        System.out.println(cola);
        System.out.println("¿Está vacía?: " + cola.is_empty());
        System.out.println("¿Cuántos elementos tiene?: " + cola.length()+"\n");  
    }  
}
