/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12numeros;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Aula12Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0;
        Scanner tec = new Scanner(System.in);
        String res;
        do{
            System.out.print("Digite um número: ");
            n = tec.nextInt();
            s += n;
            System.out.print("Quer continuar? [S/N] ");
            res = tec.next();
        }while(res.equals("S"));
        System.out.println("A soma de todos os valores é: " + s);
    }
    
}
