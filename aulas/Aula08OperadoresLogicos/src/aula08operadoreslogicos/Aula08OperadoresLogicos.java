/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula08operadoreslogicos;

/**
 *
 * @author Lucas
 */
public class Aula08OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 8;
        z = 12;
        boolean e = x<y && y<z ? true:false;
        System.out.println(e);
        boolean ou = x<y || y<z ? true:false;
        System.out.println(ou);
        boolean ou2 = x<y ^ y<z ? true:false;
        System.out.println(ou2);
        boolean nao = x<y != y<z ? true:false;
        System.out.println(nao);
        
        
        
    }
    
}
