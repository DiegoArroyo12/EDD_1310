/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Cabrera
 * @param <T>
 */
public class ConjuntoADT<T> {
    ArrayList<T> datos;
    
    public ConjuntoADT() {
        datos = new ArrayList();
    }
    
    public ArrayList<T> getArray() {
        return datos;
    }
    
    public int longitud() {
        return datos.size();
    }
    
    public boolean contiene(T elemento){
        if(datos.contains(elemento)){
            return true;
        }else{
            return false;
        }
    }

    public void agregar(T elemento) {
        if(datos.contains(elemento)){
            System.out.println("Este elemento ya existe.");
        }else{
            datos.add(elemento);
        }
    }
    
    public void eliminar(T elemento){
        datos.remove(elemento);
    }
    
    public boolean equals(ArrayList otroConjunto) {
        if(datos.equals(otroConjunto)){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean esSubConjunto(ArrayList otroConjunto) {
        ArrayList sub = new ArrayList();
        for (int i = 0; i < datos.size(); i++) {
            for (int j = 0; j < otroConjunto.size(); j++) {
                int x = Integer.parseInt(datos.get(i).toString());
                int y = Integer.parseInt(otroConjunto.get(j).toString());
                if(x == y){
                    sub.add(x);
                }
            }
        }
        if(datos.size()==sub.size()){
            return true;
        }else{
            return false;
        }
    }
    
    public void union(ArrayList otroConjunto) {
        TreeSet union = new TreeSet();
        union.addAll(datos);
        union.addAll(otroConjunto);
        System.out.println(union);
    }
    
    public void interseccion(ArrayList otroConjunto) {
        TreeSet interseccion = new TreeSet<>();
        interseccion.addAll(datos);
        interseccion.retainAll(otroConjunto);
        System.out.println(interseccion);
    }
    
    public void diferencia(ArrayList otroConjunto) {
        for (int i = 0; i < datos.size(); i++) {
            for (int j = 0; j < otroConjunto.size(); j++) {
                int x = Integer.parseInt(datos.get(i).toString());
                int y = Integer.parseInt(otroConjunto.get(j).toString());
                if(x == y){
                    datos.remove(i);
                }
            }
        }
        System.out.println(datos);
    }
    
    public void iterador() {
        Iterator it = datos.iterator();
        while(it.hasNext()) {
        System.out.println(it.next());
        }
    }

    @Override
    public String toString() {
        String estado = "";
        for (T dato : datos) {
            if(dato != null)
            estado += dato.toString() +"\n";
        }
        return estado;
    }
    
}
