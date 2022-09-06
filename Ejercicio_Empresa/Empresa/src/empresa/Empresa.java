/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

import ico.fes.acme.NominaADT;

/**
 *
 * @author diego
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NominaADT nom = new NominaADT();
        nom.LargoArchivo("C:\\Users\\diego\\Documents\\EDD_1310\\Ejercicio_Empresa\\junio.dat");
        nom.LeerArchivo("C:\\Users\\diego\\Documents\\EDD_1310\\Ejercicio_Empresa\\junio.dat");
        nom.Antiguedad();
    }
}
