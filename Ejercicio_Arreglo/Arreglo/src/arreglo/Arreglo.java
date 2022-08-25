/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo;
import java.util.Arrays;

/**
 *
 * @author diego
 */
public class Arreglo <E>{
    
    private final Object[] arr;
    public final int tamanio;
    
    public Arreglo(int tamanio) {
        arr = new Object[tamanio];
        this.tamanio = tamanio;
    }
    
    int getLongitud(){
        int longitud = arr.length;
        return longitud;
    }
    
    void setElemento(int indice, E valor){
        try {
            arr[indice] = valor;
        } catch (Exception e) {
            System.out.println("Los valores ingresados no son válidos...");
        }
    }
    
    E getElemento(int indice){
        try {
            final E elemento = (E)arr[indice];
            return elemento;
        } catch (Exception e){}
        return (E) "Indice fuera de rango";
    }
    
    void limpiar(E valor){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = valor;
        }
    }
    
    @Override
    public String toString(){
        return Arrays.toString(arr);
    }
}