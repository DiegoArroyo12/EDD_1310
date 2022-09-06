/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.acme;

import adts.Arreglo;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class NominaADT {
    private BufferedReader lector; // Lee el archivo
    private String linea; // Recibe la línea de cada fila
    private int linealen = 0; // Número de líneas
    private String partes[] = null; // Almacena cada línea leída
    private boolean PL = true; // Quitar la primera línea
    private int contador = 0; // Contador para el índice del arreglo
    private Arreglo<Empleado> arr; // Arreglo con los empleados
    //private Empleado em = new Empleado(); // Clase de empoleado
    private Arreglo<Integer> antiguedad; // Arreglo que contiene los años de ingreso
    
    public void LargoArchivo (String nArchivo) {
        try {
            lector = new BufferedReader(new FileReader(nArchivo));
            while ((lector.readLine()) != null) {
                linealen ++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void LeerArchivo(String nombreArchivo) {
        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));
            antiguedad = new Arreglo(linealen);
            arr = new Arreglo(linealen);
            System.out.println("Sueldos de los Empleados:\n");
            for (int i = 0; i < linealen; i++) {
                linea = lector.readLine();
                if (PL) {
                    PL = false;
                    continue;
                }else{
                partes = linea.split(",");
                Empleado em = new Empleado(Integer.parseInt(partes[0]), partes[1], partes[2], partes[3], Integer.parseInt(partes[4]), Integer.parseInt(partes[5]), Integer.parseInt(partes[6]));
                System.out.println(em.getNombre() + " tiene un sueldo de: $" + em.calcularSueldo());
                arr.setElemento(i, em);
                antiguedad.setElemento(i, Integer.parseInt(partes[6]));
                }
            }System.out.println("\nAntigüedad de los Empleados:\n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
   public void Antiguedad() {
        int mayor = 2022, menor = 2022;    
        int largo = antiguedad.getTamanio();
        for (int i = 1; i < largo; i++) {
            if(antiguedad.getElemento(i) > mayor){
                menor = antiguedad.getElemento(i);
            }
            if(antiguedad.getElemento(i) < menor){
                mayor = antiguedad.getElemento(i);
            }
        }
        for (int i = 1; i < largo; i++) {
            if (arr.getElemento(i).getAnioIngreso() == mayor) {
                System.out.println(arr.getElemento(i).getNombre() + " es el empleado con más antigüedad. Trabaja desde: " + mayor);
            }
            if (arr.getElemento(i).getAnioIngreso() == menor) {
                System.out.println(arr.getElemento(i).getNombre() + " es el empleado con menor antigüedad. Trabaja desde: " + menor);
            }
       }
    }
}