/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13repeticaofor; 

/**
 *
 * @author Lucas
 */
public class Aula13RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int c = 1; c<=5; c++){
            System.out.println(c);
        }
        System.out.println("Outro teste");
        for (int l=1; l<=3; l++){
            for (int c=3; c>=1; c--){
                System.out.println(c);
            }
        }
    }
    
}
