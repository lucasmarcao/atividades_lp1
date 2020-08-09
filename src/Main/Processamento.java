
package Main;

/**
 *
 * @author lucas
 */
class Processamento {
    public float peso_medio(float a){
        float peso_do_medio = a/20;
        return peso_do_medio;
                
    } 
    
    public float peso_grande(float b){
        float peso_do_grande = b/20;
        return peso_do_grande;
                
    } 
    
    public float porção_medio(float peso_do_medio){
        float comida_do_a = peso_do_medio/2 ;
        return comida_do_a;
                
    } 
    
    public float porção_grande(float peso_do_grande){
        float comida_do_b = peso_do_grande/2 ;
        return comida_do_b;
                
    } 
    
    public float ração_sacos(float peso_do_medio,float peso_do_grande){
        float sacos_de_ração = (peso_do_medio*30 + peso_do_grande*30)/20 ;
        return sacos_de_ração;
                
    } 
    
    public float custo_por_dia(float peso_do_medio, float peso_do_grande, float c){
        float custo_dia = (peso_do_medio*c) + (peso_do_grande*c) ;
        return custo_dia;
                
    } 
    
    public float custo_dia_medio(float peso_do_medio, float c){
        float dia_medio = peso_do_medio*c ;
        return dia_medio;
                
    } 
    
    public float custo_dia_grande(float peso_do_grande, float c){
        float dia_grande = peso_do_grande*c ;
        return dia_grande;
                
    } 
    
    public float custo_mes_medio(float peso_do_medio, float c){
        float mes_medio = (peso_do_medio*c*30)/10 ;
        return mes_medio;
                
    } 
    
    public float custo_mes_grande(float peso_do_grande, float c){
        float mes_grande = (peso_do_grande*c*30)/10 ;
        return mes_grande;
                
    } 
}
