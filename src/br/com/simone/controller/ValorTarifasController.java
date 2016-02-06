
package br.com.simone.controller;

import br.com.simone.model.ConsumoMes;
import br.com.simone.model.ValorTarifas;
import br.com.simone.service.ValorTarifasSRV;
import java.util.List;

public class ValorTarifasController {
    
    private ValorTarifasSRV service;

    public ValorTarifasController() {
        this.service = new ValorTarifasSRV();
    }
    
     public List<ValorTarifas> listaTodasAsTarifas() {  
        return service.listarTarifas();
    }
     
     public int atualizaValorDaTarifa ( ValorTarifas tarifa ) {
         return service.atualizaValorTarifa( tarifa );
     }
     
     public int deletaValorDeTarifa ( int id_tarifa ) {
         return service.deletaValorTarifa( id_tarifa );
     }
     
     public int adicionarNovaTarifa ( ValorTarifas tarifa ) {
         return service.salvarValorTarifa( tarifa );
     }
     
    public ValorTarifas selecionandoUltimoRegistro ( ){
         return service.selecionaUltimoRegistro( );
    }
    
}
