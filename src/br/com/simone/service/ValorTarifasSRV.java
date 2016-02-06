
package br.com.simone.service;

import br.com.simone.dao.IValorTarifasDao;
import br.com.simone.dao.ValorTarifasDao;
import br.com.simone.model.ValorTarifas;
import java.util.List;

public class ValorTarifasSRV {
    
    private IValorTarifasDao dao;

    public ValorTarifasSRV() {
        this.dao = new ValorTarifasDao();
    }
    
    public List<ValorTarifas> listarTarifas() {  
        return dao.findRecord();
    }
    
    public int atualizaValorTarifa( ValorTarifas tarifa ) {
        return dao.updateRecord( tarifa );
    }
    
    public int deletaValorTarifa ( int id_tarifa ) {
        return dao.removeRecord( id_tarifa );
    }
    
    public int salvarValorTarifa ( ValorTarifas tarifa ) {
        return dao.saveRecord( tarifa );
    }
    
    public ValorTarifas selecionaUltimoRegistro( ) {  
        return dao.findLastTarifa( );
    }
}
