/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queuedriver;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class PriorityQueueADT <T>{
    private ArrayList<T> colaprioritaria;
    private QueueADT<T> Colainterna;
    int niveles;
    int cont = 0;
    int frente;

    public PriorityQueueADT(int niveles) {
        colaprioritaria = new ArrayList(niveles);
        for (int i = 0; i < niveles; i++) {
            colaprioritaria.add(i, (T) Colainterna);
        }
        this.niveles = niveles;
        frente = 0;
    }
    
    public boolean is_empty(){
        return colaprioritaria.isEmpty();
    }
    
    public int length(){
        return colaprioritaria.size();
    }
    
    public void enqueue(int prioridad, T elem){
        if (cont < niveles){
            colaprioritaria.set(prioridad, elem);
            cont++;
        }else{
            System.out.println("Esta fuera del rango de capacidad de la lista.");
        }
    }
    
    public void dequeue(){
        colaprioritaria.remove(frente);
    }

    @Override
    public String toString() {
        String str = "";
        for (T dato: colaprioritaria) {
            str += "("+dato+")";
        }
        return str;
    }
    
    public static void main(String[] args){
        PriorityQueueADT<String> pq = new PriorityQueueADT<>(7);
        pq.enqueue(1, "Niñas");
        pq.enqueue(2, "Niños");
        pq.enqueue(2, "3ra edad");
        pq.enqueue(3, "Mujeres");
        pq.enqueue(3, "Hombres");
        pq.enqueue(4, "Maestre");
        pq.enqueue(4, "Mecánico");
        pq.enqueue(4, "Vigia");
        pq.enqueue(4, "Timonel");
        pq.enqueue(5, "Capitán");
        System.out.println(pq);
        System.out.println(pq.length());
    }
}
