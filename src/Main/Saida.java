
package Main;

/**
 *
 * @author lucas
 */
class Saida {
    public void ler_pm(String mensagem, float peso_medio){
        System.out.println(mensagem + ":" + peso_medio + " quilogramas." );
    }
    
    public void ler_pg(String mensagem, float peso_grande){
        System.out.println(mensagem + ":" + peso_grande + " quilogramas." );
    }
    
    public void ler_am(String mensagem, float porção_medio){
        System.out.println(mensagem + ":" + porção_medio + " quilogramas por porção." );
    }
    
    public void ler_ag(String mensagem, float porção_grande){
        System.out.println(mensagem + ":" + porção_grande + " quilogramas por porção." );
    }
    
    public void ler_rs(String mensagem, float ração_sacos){
        System.out.println(mensagem + ":" + ração_sacos + " sacos de ração (de 20 quilos ) por mês." );
    }
    
    public void ler_cd(String mensagem, float custo_por_dia){
        System.out.println(mensagem + ":" + custo_por_dia + " reais para alimentar os dois cachoros por dia." );
    }
    
    public void ler_cdm(String mensagem, float custo_dia_medio){
        System.out.println(mensagem + ":" + custo_dia_medio + " reais para alimentar o cachoro de porte médio por dia." );
    }
    
    public void ler_cdg(String mensagem, float custo_dia_grande){
        System.out.println(mensagem + ":" + custo_dia_grande + " reais para alimentar o cachoro de porte grande por dia.");
    }
    
    public void ler_cmm(String mensagem, float custo_mes_medio){
        System.out.println(mensagem + ":" + custo_mes_medio + " reais para alimentar o cachoro de porte médio por mês." );
    }
    
    public void ler_cmg(String mensagem, float custo_mes_grande){
        System.out.println(mensagem + ":" + custo_mes_grande + " reais para alimentar o cachoro de porte grande por mês.");
    }
}
