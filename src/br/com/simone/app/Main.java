
package br.com.simone.app;


import br.com.simone.dao.ConsumoMesDao;
import br.com.simone.dao.ValorTarifasDao;
import br.com.simone.model.ConsumoMes;
import br.com.simone.model.ValorTarifas;
import br.com.simone.service.ConsumoMesSRV;

public class Main {

    public static void main(String[] args) {
        //DBConnection.getConnection();
        ConsumoMesDao consumoDao = new ConsumoMesDao();
        ValorTarifasDao tarifaDao = new ValorTarifasDao();
        ValorTarifas tarifaRetornada = new ValorTarifas();
        ConsumoMesSRV consumoSRV = new ConsumoMesSRV();
        
        
        ConsumoMes dataInicial = new ConsumoMes();
        ConsumoMes dataFinal = new ConsumoMes();
        
        dataInicial.setData("22/10/2015");
        dataFinal.setData("23/11/2015");
        
        //tarifaRetornada = tarifaDao.findLastTarifa( );
        
        //double conta = consumoSRV.CalculaContaLuz(dataInicial, dataFinal);
        
        
        System.out.println();
        
        }
       
   
    
}
