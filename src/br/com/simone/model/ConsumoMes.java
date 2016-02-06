package br.com.simone.model;

public class ConsumoMes {

   
    private int id;
    private String data;
    private int medida;
    private int medida_anterior;
    private int kwh_Dia;
   
    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    public int getMedida_anterior() {
        return medida_anterior;
    }

    public void setMedida_anterior(int medida_anterior) {
        this.medida_anterior = medida_anterior;
    }

    public int getKwh_Dia() {
        return kwh_Dia;
    }

    public void setKwh_Dia(int kwh_Dia) {
        this.kwh_Dia = kwh_Dia;
    }

    @Override
    public String toString() {
        return "ConsumoMes{" + "id=" + id + ", data=" + data + ", medida=" + medida + ", medida_anterior=" + medida_anterior + ", kwh_mes=" + kwh_Dia + '}';
    }
    
}
