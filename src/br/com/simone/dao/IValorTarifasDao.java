
package br.com.simone.dao;


import br.com.simone.model.ValorTarifas;
import java.util.List;

public interface IValorTarifasDao {
    List<ValorTarifas> findRecord();
    int updateRecord(ValorTarifas consumo );
    int removeRecord(int id_consumo );
    int saveRecord(ValorTarifas consumo );
    ValorTarifas findLastTarifa();
    
}
