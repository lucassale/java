/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula15testefuncao01;

/**
 *
 * @author Lucas
 */
public class Aula15TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    //static void soma (int a, int b){ Aqui é um método!
    static int soma(int a, int b){ // Aqui é uma função!
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa.");
        int s = soma(5, 2);
        System.out.println("A soma vale: " + s);
        
    }
    
}
