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
class Processamento {
    public float media_aluno(float nota1,float nota2,float nota3,float nota4){
        float media = (nota1+nota2+nota3+nota4)/4;
        return media;
    }
    
    public float maior_nota(float nota1,float nota2,float nota3,float nota4){
        float cont = 0;
        if (nota1>nota2 & nota3>nota2 & nota4>nota2) {
            cont = nota2;
        }
        
        if (nota2>nota1 & nota3>nota1 & nota4>nota1) {
            cont = nota1;
        }
        
        if (nota1>nota3 & nota2>nota3 & nota4>nota3) {
            cont = nota3;
        }
        
        if (nota1>nota4 & nota3>nota4 & nota2>nota4) {
            cont = nota4;
        }
        return cont;
    }
    
    public float menor_nota(float nota1,float nota2,float nota3,float nota4){
        float cont = 0;
        if (nota1<nota2 & nota3<nota2 & nota4<nota2) {
            cont = nota2;
        }
        
        if (nota2<nota1 & nota3<nota1 & nota4<nota1) {
            cont = nota1;
        }
        
        if (nota1<nota3 & nota2<nota3 & nota4<nota3) {
            cont = nota3;
        }
        
        if (nota1<nota4 & nota3<nota4 & nota2<nota4) {
            cont = nota4;
        }
        return cont;
        
    }

    
    
}
