package br.com.simone.dao;

import br.com.simone.model.ConsumoMes;
import java.util.List;

public interface IConsumoMesDao {
    
    List<ConsumoMes> selectRecord();
    int updateRecord(ConsumoMes consumo );
    int removeRecord(int id_consumo );
    int saveRecord(ConsumoMes consumo );
    int findUltimaMedida();
    int selectMediaKWhPorPeriodo( ConsumoMes dataInicial, ConsumoMes dataFinal );
    int selectMaiorMedidaPorPeriodo( ConsumoMes dataInicial, ConsumoMes dataFinal );
    int selectMenorMedidaPorPeriodo( ConsumoMes dataInicial, ConsumoMes dataFinal );
    //List<Integer> selectTotalKwh( ConsumoMes dataInicial, ConsumoMes dataFinal );
    ConsumoMes findId( int idConsumo );
    ConsumoMes findList(ConsumoMes consumo);
}
