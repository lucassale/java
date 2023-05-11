/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio12repita;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Exercicio12Repita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0, t=0, p=0, i=0, a=0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            s+=n;
            if (n>0 && n!=0){
            t+=1;    
            }
            if (n%2==0 && n!=0){
                p+=1;
            }
            if (n%2==1){
                i+=1;
            }
            if (n>100){
                a+=1;
            }
        }while (n!=0);
        int m = s/t;
        JOptionPane.showMessageDialog(null, "<html>Total de valores: " + t + "<br>"
                + "Total de Pares: " + p + "<br>"
                + "Total de Impares: " + i + "<br>"
                + "Acima de 1: " + a + "<br>"
                + "Média de valores: " + m);
        
    }
}
