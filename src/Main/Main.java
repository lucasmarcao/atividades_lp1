/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;



/**
 *
 * @author lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("1 - Hipotenusa\n" +"2 - Bhaskara\n" +"3 - Distância\n" +"4 - Maior e menor\n" +"5 - Fibonacci\n" +"6 - Sair do programa\n" + "");
        System.out.println(" escolha uma opção: ");   
        int escolha = teclado.nextInt();
        double hipotenusa = 0;
        
        while(escolha!=6){
            
            if (escolha==1) {
            System.out.println("cateto a: ");
            double ca= teclado.nextDouble();
            System.out.println("cateto b: ");
            double cb = teclado.nextDouble();
            double hip= (ca*ca) + (cb*cb);
            hipotenusa = Math.sqrt(hip);
            System.out.println("a hipotenusa é : " + hipotenusa);
            
        }
        
        
        if (escolha==2) {
            System.out.println("qual é o valor de A:");
            double a = teclado.nextDouble();
            System.out.println("qual é o valor de B:");
            double b = teclado.nextDouble();
            System.out.println("qual é o valor de C:");
            double c = teclado.nextDouble();
            double bk = (b*b) - 4*a*c;
            double bhaA = -b+Math.sqrt(bk);
            double bhaB = -b-Math.sqrt(bk);
            double bhaskaraA = (bhaA)/(2*a);
            double bhaskaraB = (bhaB)/(2*a);
            System.out.println("O valor de x1 é de: " + bhaskaraA);
            System.out.println("O valor de x2 é de: " + bhaskaraB);
            
        }
        
        if (escolha==3) {
            System.out.println("qual sera o valor de x1?");
            double x1= teclado.nextDouble();
            System.out.println("qual sera o valor de x2(obrigatoriamente sendo maior que x1)?");
            double x2= teclado.nextDouble();
            System.out.println("qual sera o valor de y1?");
            double y1= teclado.nextDouble();
            System.out.println("qual sera o valor de y2(obrigatoriamente sendo maior que y1)?");
            double y2= teclado.nextDouble();
            double dis = ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
            double distancia = Math.sqrt(dis);
            System.out.println("A distancia entre dois pontos é de :" + distancia );
            
        }
        
        if (escolha==4) {
            double n= 0;
            double numerao = 0;
            System.out.println("digite o numero que voce desejsa(maior que 0.)");
            double numeral = teclado.nextDouble();
            while(n>=0){
                System.out.println("Digite o numero que voce deseja:");
                double numeros = teclado.nextDouble();
                n = numeros;
                if (numerao<numeros) {
                    numerao = numeros;
                }
                if (numeral>numeros) {
                    numeral=numeros;
                }
            }
            System.out.println("O maior numero entre todos os digitados foi:" + numerao);
            System.out.println("O menor numero entre todos os digitados foi:" + numeral);
            
        }
        
        if (escolha==5) {
            int nu = 0;
            int penultimo = 0;
            int ultimo = 1;
            System.out.println("Escolha o numero de componentes que a sequencia de fibonacci terá : ");
            int fibonacci = teclado.nextInt();
            System.out.println(" 0");
            for (int i = 0; i < (fibonacci-1); i++) {
                nu = ultimo + penultimo;
                penultimo = ultimo;
                ultimo = nu;
                System.out.println(" " + penultimo);
            }
            
        }
        System.out.println("1 - Hipotenusa\n" +"2 - Bhaskara\n" +"3 - Distância\n" +"4 - Maior e menor\n" +"5 - Fibonacci\n" +"6 - Sair do programa\n" + "");
              System.out.println(" escolha uma opção: ");   
              escolha = teclado.nextInt();
        }
        
        if (escolha==6) {
            System.out.println("Voce saiu do programa. <3");        
        }
        
        
    }
    
}
