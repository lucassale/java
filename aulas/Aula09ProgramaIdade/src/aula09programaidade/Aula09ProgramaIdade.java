/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula09programaidade;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Aula09ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        LocalDate year = LocalDate.now();
        System.out.print("Qual seu ano de nascimento? ");
        int ano = teclado.nextInt();
        int atual = year.getYear();
        int idade = atual - ano;
        System.out.println("Sua Idade é: " + idade);
        if (idade>=18){
            System.out.println("Você é Maior de Idade.");
        }else{
            System.out.println("Você é Menor de Idade.");
        }
    }
    
}
