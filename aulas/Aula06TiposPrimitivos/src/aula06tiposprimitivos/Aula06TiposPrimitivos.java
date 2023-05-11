/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula06tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Aula06TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite o nome do Aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do Aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota do %s é %.2f\n", nome, nota);
        
    }
    
}
