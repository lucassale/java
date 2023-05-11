/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula14vetor04;

import java.util.Arrays;

/**
 *
 * @author Lucas
 */
public class Aula14Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = {4, 3, 8, 1, -7, 8, 6};
        for (int c:v){
            System.out.print(c + ", ");
        }
        System.out.println();
        int p = Arrays.binarySearch(v, 1);
        System.out.println("Encontrie o valor 1 na posição: " + p);
        
    }
    
}
