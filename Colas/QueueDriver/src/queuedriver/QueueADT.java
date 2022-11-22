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
public class QueueADT <T>{
    ArrayList<T> cola;
    int frente;

    public QueueADT() {
        cola = new ArrayList<>();
        frente = 0;
    }
    
    public boolean is_empty(){
        return cola.isEmpty();
    }
    
    public int length(){
        return cola.size();
    }
    
    public void enqueue(T elem){
        cola.add(elem);
    }
    
    public void dequeue(){
        cola.remove(frente);
    }

    @Override
    public String toString() {
        String str = "";
        for (T dato: cola) {
            str += "|"+dato+"|";
        }
        return str;
    }
}
