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
    
    public boolean Desarrollo(String str){
        char Parentesis[] = str.toCharArray();
        int i;
        for(i=0; i<Parentesis.length;i++){
            if(Parentesis[i]=='('){
                parentesis.push("(");
            }
            if(Parentesis[i]==')'){
                if(!parentesis.isEmpty()){
                    parentesis.pop();
                }
            }
            if(Parentesis[i]=='{'){
                parentesis.push("{");
            }
            if(Parentesis[i]=='}'){
                if(!parentesis.isEmpty()){
                    parentesis.pop();
                }
            }
            if(Parentesis[i]=='['){
                parentesis.push("[");
            }
            if(Parentesis[i]==']'){
                if(!parentesis.isEmpty()){
                    parentesis.pop();
                }
            }
        }
        return parentesis.isEmpty();
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
        System.out.println(t1.Desarrollo(str));
        
        System.out.println("\nTexto 2: ");
        File txt1 = new File("C:\\Users\\diego\\Documents\\EDD_1310\\Pilas\\texto2.txt");
        Scanner obj1 = new Scanner(txt1);
        String str1 = "";
    
        while (obj1.hasNextLine()){
            str += obj1.nextLine();
        }
        BalanceoParentesis t2 = new BalanceoParentesis(str1);
        System.out.println(t2.Desarrollo(str1));
        
        System.out.println("\nPrueba extra: ");
        BalanceoParentesis prueba = new BalanceoParentesis("{{{}}");
        System.out.println(prueba.Desarrollo("{{{}}"));
    }
    
}
