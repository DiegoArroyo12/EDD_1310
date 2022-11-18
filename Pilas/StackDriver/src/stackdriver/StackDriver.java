/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackdriver;

/**
 *
 * @author diego
 */
public class StackDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackADT<String> pila = new StackADT<>();
        pila.push("Angela");
        pila.push("Diego");
        pila.push("Juan");
        System.out.println(pila);
        System.out.println("¿Está vacía?: "+pila.isEmpty());
        System.out.println("¿Cuántos elementos hay en la pila?: "+pila.getLength());
        System.out.println("¿Cuál es el último elemento de la pila?: "+pila.peek()+"\n");
        pila.push("Diana");
        System.out.println(pila);
        System.out.println("¿Está vacía?: "+pila.isEmpty());
        System.out.println("¿Cuántos elementos hay en la pila?: "+pila.getLength());
        System.out.println("¿Cuál es el último elemento de la pila?: "+pila.peek()+"\n");
        String sacado = pila.pop();
        System.out.println(pila);
        System.out.println("Sacamos: "+sacado);
        StackADT<String> pilavacia = new StackADT<>();
        System.out.println(pilavacia);
        System.out.println("¿Está vacía?: "+pilavacia.isEmpty());
    }
    
}
