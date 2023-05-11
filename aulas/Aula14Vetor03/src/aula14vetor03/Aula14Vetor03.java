/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula14vetor03;

import java.util.Arrays;

/**
 *
 * @author Lucas
 */
public class Aula14Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {7, 5, 1, 3, 9, -5};
        Arrays.sort(n);
        for (int v: n){
            System.out.print(v + " ");
        }
        System.out.println();
    }
    
}
