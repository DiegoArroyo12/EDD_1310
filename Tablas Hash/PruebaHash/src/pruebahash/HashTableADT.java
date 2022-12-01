/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebahash;

import java.util.Arrays;
import listaligada.ListaLigada;
import listaligada.Nodo;

/**
 *
 * @author diego
 */
public class HashTableADT <T>{
    T[] arreglo;
    int tamanio;

    public HashTableADT(int tam) {
        tamanio = tam;
        arreglo = (T[]) new String[tamanio];
        
    }
    
    public void add(int key, T value){
        int llave = key % tamanio;
        if (arreglo[llave] == null){
            arreglo[llave] = value;
        }else{
            boolean cont = true;
            while (cont) {
                int y = llave++;
                if (arreglo[y] == null) {
                    arreglo[y] = value;
                    cont = false;
                }
            }
        }
    }
    
    public void valueOf(int key){
        int llave = key % tamanio;
        System.out.println(arreglo[llave]);
    }
    
    public void remove(int key){
        int llave = key % tamanio;
        arreglo[llave] = null;
    }

    @Override
    public String toString() {
        String content = "|";
        for (T elem : arreglo) {
            content+=" " + elem + " |";
        }
        return content;
    }
}
