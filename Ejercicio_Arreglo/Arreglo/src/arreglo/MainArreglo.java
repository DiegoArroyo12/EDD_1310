/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglo;
import arreglo.Arreglo;
/**
 *
 * @author diego
 */
public class MainArreglo {
    public static void main(String[] args){
        Arreglo arr = new Arreglo(10);
        arr.setElemento(1, new Persona("Diego", 18));
        System.out.println(arr);
        System.out.println(arr.getLongitud());
        arr.setElemento(5, new Persona("Jesús", 25));
        System.out.println(arr.getElemento(1));
        System.out.println(arr.getElemento(5));
        System.out.println(arr.getElemento(11));
        arr.limpiar("Diego");
        System.out.println(arr);
        System.out.println(arr.toString());
    }
}
