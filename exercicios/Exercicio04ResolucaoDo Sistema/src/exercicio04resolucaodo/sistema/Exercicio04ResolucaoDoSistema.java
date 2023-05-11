
package exercicio04resolucaodo.sistema;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Exercicio04ResolucaoDoSistema {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Resolução: " + d.width + "x" + d.height);
        
    }
    
}
