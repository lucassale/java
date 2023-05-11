
package exercicio04idiomadosistema;

import java.util.Locale;

public class Exercicio04IdiomaDoSistema {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        String idioma = loc.getDisplayLanguage();
        System.out.println("O idioma esta em: " + idioma);
                
    }
    
}
