
package Main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        //entrada
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("quantidade de camisetas pequenas:");
        int q_camiseta_p = teclado.nextInt();
        
        System.out.println("quantidade de camisetas medias:");
        int q_camiseta_m = teclado.nextInt();
        
        System.out.println("quantidade de camisetas grandes:");
        int q_camiseta_g = teclado.nextInt();
        
        System.out.println("custo da camiseta pequena:");
        float camiseta_p = teclado.nextFloat();
        
        System.out.println("custo da camiseta média:");
        float camiseta_m = teclado.nextFloat();
        
        System.out.println("custo da camiseta grande:");
        float camiseta_g = teclado.nextFloat();
        
        //processamento 
        
        float valor_camisetap = q_camiseta_p*camiseta_p;
        
        float valor_camisetam = q_camiseta_m*camiseta_m;
        
        float valor_camisetag = q_camiseta_g*camiseta_g;
        
        float venda_camisetap = valor_camisetap + (valor_camisetap / 100) * 55;
        
        float venda_camisetam = valor_camisetam + (valor_camisetam / 100) * 55;
        
        float venda_camisetag = valor_camisetag + (valor_camisetag / 100) * 55;
        
        float custo_total = valor_camisetap + valor_camisetam + valor_camisetag;
        
        float valor_total_vendas = venda_camisetap + venda_camisetam + venda_camisetag;
        
        float lucro = (venda_camisetap - valor_camisetap) + (venda_camisetam - valor_camisetam) + (venda_camisetag - valor_camisetag);
        
        //saida 
        System.out.print("O valor total de custo de todas as camisetas pequenas foi de: " + valor_camisetap + "R$ reais .  ");
        System.out.println("");

        System.out.print("O valor total de custo de todas as camisetas medias foi de: " + valor_camisetam + "R$ reais .");
        System.out.println("");
              
        System.out.print("O valor total de custo de todas as camisetas grandes foi de: " + valor_camisetag + "R$ reais .");
        System.out.println("");
        
        System.out.print("O valor de venda de todas as camisetas pequenas foi de: " + venda_camisetap + "R$ reais .");
        System.out.println("");
        
        System.out.print("O valor de venda de todas as camisetas medias foi de: " + venda_camisetam + "R$ reais .");
        System.out.println("");
        
        System.out.print("O valor de venda de todas as camisetas grandes foi de: " + venda_camisetag + "R$ reais .");
        System.out.println("");
        
        System.out.print("O custo total para fazer as camisetas foi de: " + custo_total + "R$ reais.");
        System.out.println("");
        
        System.out.print("o valor total das vendas de todas as camisetas foi de: " + valor_total_vendas + "R$ reais .");
        System.out.println("");
        
        System.out.print("O LUCRO QUE A FÁBRICA ARRECADOU FOI DE : " + lucro + "R$ reais ."); 
        System.out.println("");
      
        
    }
    
}
