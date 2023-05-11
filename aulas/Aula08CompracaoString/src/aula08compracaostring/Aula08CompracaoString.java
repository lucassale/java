/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula08compracaostring;

/**
 *
 * @author Lucas
 */
public class Aula08CompracaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "lucas";
        String nome2 = "lucas";
        String nome3 = new String("lucas");
        String r = nome1.equals(nome3) ? "igual":"diferentel";
        System.out.println(r);
        
    }
    
}
