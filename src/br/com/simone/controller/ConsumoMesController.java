package br.com.simone.controller;

import br.com.simone.model.ConsumoMes;
import br.com.simone.service.ConsumoMesSRV;
import java.util.List;

public class ConsumoMesController {

    private ConsumoMesSRV service;

    /* A class de controler é apenas voltada para a interface grafica */
    public ConsumoMesController() {
        this.service = new ConsumoMesSRV();
    }
    // Adiciona e atualiza registro
    public int merge(ConsumoMes consumo) {
        return service.merge(consumo);
    }

    public int excluirRegistro(int id) {
        return service.remove(id);
    }

    public List<ConsumoMes> listarRegistros() {
        return service.findAll();
    }

    public double calculaMediaKwhPorPeriodo(ConsumoMes dataInicial, ConsumoMes dataFinal) {
        return service.calculaMediaKwhPorPeriodo(dataInicial, dataFinal);
    }
    
    public int calculaTotalKwhPorPeriodo(ConsumoMes dataInicial, ConsumoMes dataFinal) {
        return service.calculaTotalKwhPorPeriodo(dataInicial, dataFinal);
    }
    
    
    public double calculaValorContaLuz(ConsumoMes dataInicial, ConsumoMes dataFinal) {
        return service.CalculaContaLuz(dataInicial, dataFinal);
    }
}
