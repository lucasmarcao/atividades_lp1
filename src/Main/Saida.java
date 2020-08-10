/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author lucas
 */
class Saida {
    public void ler_media(String mensagem, float media){
        System.out.println(mensagem + media);  
    }
    
    public void ler_maior(String mensagem, float cont){
        System.out.println(mensagem+cont);
    }
    
    public void ler_menor(String mensagem, float cont){
        System.out.println(mensagem+cont);
    }
    
    public void conceito(float media){
        if(media<40){
            System.out.println("Nota E. REPROVADO.");
        } else if (media<60) {
            System.out.println("Nota D. REPROVADO.");
        } else if (media<75){
            System.out.println("Nota C. APROVADO.");
        } else if (media<90){
            System.out.println("Nota B. APROVADO.");
        } else if (media<100) {
            System.out.println("Nota A. APROVADO.");
        }
    }
}
