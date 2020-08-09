
package Main;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
class Entrada {
    Scanner teclado = new Scanner(System.in);
    
    public float cachoro_medio(String mensagem){
        System.out.println(mensagem);
        float x = teclado.nextFloat();
        return x;
        
    }
    
    public float cachoro_grande(String mensagem){
        System.out.println(mensagem);
        float x = teclado.nextFloat();
        return x;
        
    }
    
    public float preço_ração(String mensagem){
        System.out.println(mensagem);
        float x = teclado.nextFloat();
        return x;
        
    }
    
}
