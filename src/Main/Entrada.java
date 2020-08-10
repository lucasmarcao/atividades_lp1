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
class Entrada {
    Scanner teclado = new Scanner(System.in);
    
    public float nota1 (String mensagem){
        System.out.println(mensagem);       
        float a = teclado.nextFloat();
        return a;
    }
    
    public float nota2 (String mensagem){
        System.out.println(mensagem);       
        float b = teclado.nextFloat();
        return b;
    }
    
    public float nota3 (String mensagem){
        System.out.println(mensagem);       
        float c = teclado.nextFloat();
        return c;
    }
    
    public float nota4 (String mensagem){
        System.out.println(mensagem);       
        float d = teclado.nextFloat();
        return d;
    }
}
