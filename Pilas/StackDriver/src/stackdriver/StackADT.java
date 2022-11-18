/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackdriver;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class StackADT <T>{
    ArrayList<T> datos;
    int tope;
    T pop;

    public StackADT() {
        datos = new ArrayList<>();
        tope = -1;
    }
    
    public boolean isEmpty(){
        return datos.isEmpty();
    }
    
    public int getLength(){
        return datos.size();
    }
    
    public T pop(){
        pop = datos.remove(tope);
        tope--;
        return pop;
    }
    
    public T peek(){
        return datos.get(tope);
    }
    
    public void push(T dato){
        datos.add(dato);
        tope = datos.size()-1;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = datos.size()-1; i >= 0; i--) {
            str += "|"+datos.get(i)+"|\n";
        }
        return str;
    }
}
