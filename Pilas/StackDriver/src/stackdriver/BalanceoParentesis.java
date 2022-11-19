/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackdriver;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class BalanceoParentesis {
    String str = "";
    StackADT<String> parentesis = new StackADT<>();
    
    public BalanceoParentesis(String str){
        this.str = str;
    }
    
    public String Desarrollo(){
        int i = 0;
        while (i < this.str.length()) {
            if (this.str.charAt(i) == '('){
                parentesis.push("(");
            } else if (this.str.charAt(i) == ')') {
                if (parentesis.isEmpty()){
                    parentesis.pop();
                }else{
                    parentesis.push(")");
                    break;
                }
            }else
            if (this.str.charAt(i) == '{'){
                parentesis.push("{");
            } else if (this.str.charAt(i) == '}') {
                if (parentesis.isEmpty()){
                    parentesis.pop();
                }else{
                    parentesis.push("}");
                    break;
                }
            }else
            if (this.str.charAt(i) == '['){
                parentesis.push("[");
            } else if (this.str.charAt(i) == ']') {
                if (parentesis.isEmpty()){
                    parentesis.pop();
                }else{
                    parentesis.push("]");
                    break;
                }
            }
            i++;
        }
        String respuesta;
        if (parentesis.isEmpty()){
            respuesta = "Está equilibrado";
        } else{
            respuesta = "No está equilibrado";
        }
        return respuesta;
    }
    public static void main(String[] args) throws Exception{
        System.out.println("Texto 1: ");
        File txt = new File("C:\\Users\\diego\\Documents\\EDD_1310\\Pilas\\texto1.txt");
        Scanner obj = new Scanner(txt);
        String str = "";
    
        while (obj.hasNextLine()){
            str += obj.nextLine();
        }
        BalanceoParentesis t1 = new BalanceoParentesis(str);
        System.out.println(t1.Desarrollo());
        
        System.out.println("\nTexto 2: ");
        File txt1 = new File("C:\\Users\\diego\\Documents\\EDD_1310\\Pilas\\texto2.txt");
        Scanner obj1 = new Scanner(txt1);
        String str1 = "";
    
        while (obj1.hasNextLine()){
            str += obj1.nextLine();
        }
        BalanceoParentesis t2 = new BalanceoParentesis(str1);
        System.out.println(t2.Desarrollo());
    }
}