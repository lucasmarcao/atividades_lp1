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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        float nota1 = entrada.nota1("A nota do primeiro bimestre é: ");
        
        float nota2 = entrada.nota2("A nota do primeiro bimestre é: ");
        
        float nota3 = entrada.nota3("A nota do primeiro bimestre é: ");
        
        float nota4 = entrada.nota4("A nota do primeiro bimestre é: ");
        
        Processamento processamento = new Processamento();
        
        float md = processamento.media_aluno(nota1, nota2, nota3, nota4);
        
        float maiorn = processamento.maior_nota(nota1, nota2, nota3, nota4);
                
        float menorn = processamento.menor_nota(nota1, nota2, nota3, nota4);
        
        Saida saida = new Saida();
        
        saida.ler_media("A media deste aluno foi de: ", md);
        
        saida.ler_maior("A menor nota do seu aluno foi de:", maiorn);
        
        saida.ler_menor("A maior nota do seu aluno foi de:", menorn);
        
        saida.conceito(md);
        
        
    }
    
}
