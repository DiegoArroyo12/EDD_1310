/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adtlistaligada;

import java.util.Iterator;

/**
 *
 * @author diego
 */
public class ListaLigada <E>{
    private Nodo<E> cabeza;
    private int tamanio;

    public ListaLigada() {
    }

    public ListaLigada(Nodo<E> cabeza) {
        this.cabeza = cabeza;
    }
    
    public Nodo<E> getNodo(){
        return cabeza;
    }
    
    public boolean estaVacia(){
        return this.cabeza.getDato() == null;
    }
    
    public int getTamanio(){
        this.tamanio = 0;
        if (cabeza.getDato() != null) {
            this.tamanio += 1;
        }
        Nodo<E> aux = cabeza;
        while (aux != null) {
            aux = aux.getSiguiente();
            if (aux == null) {
                break;
            }
            this.tamanio += 1;
        }
        return this.tamanio;
    }
    
    public void agregarFinal(Nodo<E> valor){
        Nodo<E> aux = cabeza;
        for (int i = 0; i < (this.tamanio)+1; i++) {
            aux = cabeza.getSiguiente();
        }
        aux.getSiguiente().setSiguiente(valor);
    }
    
    public void agregarInicio(Nodo<E> valor){
        Nodo<E> aux = cabeza;
        aux = cabeza;
        cabeza = valor;
        cabeza.setSiguiente(aux);
    }
    
    public void agregarDespuesDe(Nodo<E> referencia, E valor){
        Nodo<E> aux2 = cabeza;
        Nodo<E> nuevo = new Nodo(valor);
        while (true) {            
            aux2 = aux2.getSiguiente();
            if (aux2.getDato() == referencia.getDato()) {
                nuevo.setSiguiente(aux2.getSiguiente());
                break;
            }
        }
        
        Nodo<E> aux = cabeza;
        aux = cabeza;
        boolean continuar = true;
        if(aux.getDato() == referencia.getDato()){
            aux.setSiguiente(nuevo);
            continuar = false;
        }
        while (continuar) {
            aux = aux.getSiguiente();
            if(aux.getDato() == referencia.getDato()){
                aux.setSiguiente(nuevo);
                break;
            }
        }
    }

    public void eliminar(int posicion){
        Nodo<E> aux = cabeza;
        Nodo<E> resp = new Nodo();
        for (int i = 1; i <= posicion+1; i++) {
            aux = aux.getSiguiente();
        }
        resp.setDato(aux.getDato());
        resp.setSiguiente(aux.getSiguiente());
        Nodo<E> aux2 = cabeza;
        for (int i = 1; i <= posicion; i++) {
            aux2 = aux2.getSiguiente();
            if (i == posicion) {
                aux2.setDato(resp.getDato());
                aux2.setSiguiente(resp.getSiguiente());
            }
        }
    }
    
    public void eliminarPrimero(){
        Nodo<E> aux = new Nodo();
        aux = cabeza.getSiguiente();
        cabeza = aux;
    }
    
    public void eliminarFinal(){
        Nodo<E> aux = cabeza;
        aux = cabeza;
        boolean continuar = true;
        
        Nodo penultimo = new Nodo();
        Nodo aux2 = this.cabeza;
        ListaLigada list = new ListaLigada(cabeza);
        int contador = 0;
        while ((aux2.getSiguiente() != null)) {
            contador += 1;
            if (contador == list.getTamanio()-1) {
                penultimo.setDato(aux2.getDato());
                break;
            }
            aux2 = aux2.getSiguiente();
        }
        
        penultimo = new Nodo(penultimo.getDato());
        
        if(aux.getDato() == penultimo.getDato()){
            penultimo.setSiguiente(new Nodo());
            continuar = false;
        }
        while (continuar) {
            aux = aux.getSiguiente();
            if(aux.getDato() == penultimo.getDato()){
                aux.setSiguiente(null);
                break;
            }
        }
    }
    
    public int buscar(E valor){
        int posicion = -1;
        Nodo<E> aux = cabeza;
        aux = cabeza;
        if (aux.getDato() == valor) {
            posicion = 0;
        }else{
            ListaLigada<E> list = new ListaLigada(cabeza);
            for (int i = 1; i < list.getTamanio(); i++) {
                aux = aux.getSiguiente();
                if(aux.getDato() == valor){
                    posicion = i;
                    break;
                }
            }
        }
        return posicion;
    }
    
    public void actualizar(E aBuscar, E valor){
        Nodo<E> aux = cabeza;
        if (aux.getDato() == aBuscar) {
            aux.setDato(valor);
        }else{
            for (int i = 0; i < (this.tamanio); i++) {
                aux = aux.getSiguiente();
                if (aux.getDato() == aBuscar) {
                    aux.setDato(valor);
                    break;
                }
            }
        }
    }
    
    public void transversal(){
        Nodo<E> aux = cabeza;
        System.out.print("Transversal: ");
        while (aux != null) {
            System.out.print(aux);
            aux = aux.getSiguiente();
        }
        System.out.println();
    }
    
    @Override
    public String toString() {
        return this.cabeza.toString();
    }  
}
