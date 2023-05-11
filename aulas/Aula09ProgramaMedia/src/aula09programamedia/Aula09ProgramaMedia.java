/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula09programamedia;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Aula09ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a 1° nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a 2° nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2) / 2;
        if (m>=7){
            System.out.printf("Parabéns! Sua média foi: %.1f\n", m);
        }else{
            System.out.printf("Que pena. Sua média foi: %.1f\n", m);
        }
        
    }
    
}
