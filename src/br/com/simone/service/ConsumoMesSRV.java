package br.com.simone.service;

import br.com.simone.dao.ConsumoMesDao;
import br.com.simone.dao.IConsumoMesDao;
import br.com.simone.dao.IValorTarifasDao;
import br.com.simone.dao.ValorTarifasDao;
import br.com.simone.model.ConsumoMes;
import br.com.simone.model.ValorTarifas;
import java.util.List;

public class ConsumoMesSRV {

    private IConsumoMesDao dao;
    private IValorTarifasDao daoTarifas;

    /* A class facade intermedia a interface grafica da class dao que faz a conexao com BD
     É class facade que é feita toda a regra de negocio se necessario  */
    public ConsumoMesSRV() {
        this.dao = new ConsumoMesDao();
        this.daoTarifas = new ValorTarifasDao();
    }

    private int save(ConsumoMes consumo) {
        int med = this.dao.findUltimaMedida();
        consumo.setMedida_anterior(med);
        consumo.setKwh_Dia(consumo.getMedida() - med);
        return dao.saveRecord(consumo);
    }

    private int update(ConsumoMes consumo) {

        consumo.setKwh_Dia(consumo.getMedida() - consumo.getMedida_anterior());

        ConsumoMes proximo = dao.findList(consumo);
        proximo.setMedida_anterior(consumo.getMedida());
        proximo.setKwh_Dia(proximo.getMedida() - proximo.getMedida_anterior());

        dao.updateRecord(proximo);
        return dao.updateRecord(consumo);
    }

    public int merge(ConsumoMes consumo) {

        if (consumo.getId() > 0) {

           return this.update(consumo);

        } else {

           return this.save(consumo);

        }

    }

    public int remove(int consumo) {
        return dao.removeRecord(consumo);
    }

    public List<ConsumoMes> findAll() {
        return dao.selectRecord();
    }

    public double calculaMediaKwhPorPeriodo(ConsumoMes dataInicial, ConsumoMes dataFinal) {

        int totalKwh = calculaTotalKwhPorPeriodo(dataInicial, dataFinal);

        int retornoTotalDeDias = 0;
        retornoTotalDeDias = dao.selectMediaKWhPorPeriodo(dataInicial, dataFinal);
        double media = 0.0;

        if (retornoTotalDeDias != 0) {
            media = (double) totalKwh / retornoTotalDeDias;
        }

        return media;
    }

    public int calculaTotalKwhPorPeriodo(ConsumoMes dataInicial, ConsumoMes dataFinal) {

        int maiorMedida = dao.selectMaiorMedidaPorPeriodo(dataInicial, dataFinal);
        int menorMedida = dao.selectMenorMedidaPorPeriodo(dataInicial, dataFinal);

        int total_kwh = 0;
        total_kwh = maiorMedida - menorMedida;

        return total_kwh;
    }

    public double CalculaContaLuz(ConsumoMes dataInicial, ConsumoMes dataFinal) {

        ValorTarifas tarifas = new ValorTarifas();
        float totalKwh = calculaTotalKwhPorPeriodo(dataInicial, dataFinal);
        double tarifaNormal, tarifaBVermelha, tarifaIluminacao, valorContaLuz;

        tarifas = daoTarifas.findLastTarifa();
        tarifaNormal = tarifas.getTarifa();
        tarifaBVermelha = tarifas.getTarifa_bVermelha();
        tarifaIluminacao = tarifas.getTarifa_Iluminacao();

        valorContaLuz = (totalKwh * tarifaNormal) + (totalKwh * tarifaBVermelha) + tarifaIluminacao;

        return valorContaLuz;
    }
}
