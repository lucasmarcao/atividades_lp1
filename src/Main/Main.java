
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
        float a = entrada.cachoro_medio("Qual é o peso do cachoro de porte médio ? ");
        
        float b = entrada.cachoro_grande("Qual é o peso do cachoro de porte grande ? ");
        
        float c = entrada.preço_ração("Qual será o preço da ração dos cachoros ? ");
        
        Processamento processamento = new Processamento();
        float pm = processamento.peso_medio(a);
        
        float pg = processamento.peso_grande(b);
        
        float am = processamento.porção_medio(pm);
        
        float ag = processamento.porção_grande(pg);
        
        float rs = processamento.ração_sacos(pm, pg);
        
        float cd = processamento.custo_por_dia(pm, pg, c);
        
        float cdm = processamento.custo_dia_medio(pm, c);
        
        float cdg = processamento.custo_dia_grande(pg, c);
        
        float cmm = processamento.custo_mes_medio(cdm, c);
        
        float cmg = processamento.custo_mes_grande(cdg, c);
        
        Saida saida = new Saida();
        saida.ler_pm("a quantidade diária que o cachoro de porte medio deve receber é de ", pm );
        saida.ler_pg("a quantidade diária que o cachoro de porte grande deve receber é de ", pg );
        saida.ler_am("a quantidade de ração por porção que o cachoro de porte medio deve receber é de ", am );
        saida.ler_ag("a quantidade de ração por porção que o cachoro de porte grande deve receber é de ", pm );
        saida.ler_rs("a quantidade de sacos comprados por mes será de  ", rs );
        saida.ler_cd("a custo de ração que os cachoros gastam é de ", cd );
        saida.ler_cdm("é necessário ", cdm );
        saida.ler_cdg("é necessário ", cdg );
        saida.ler_cmm("é necessário ", cmm );
        saida.ler_cmg("é necessário ", cmg );
        
    }
    
}
