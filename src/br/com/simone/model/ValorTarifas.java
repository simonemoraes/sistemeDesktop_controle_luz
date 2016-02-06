
package br.com.simone.model;

public class ValorTarifas {
    
    private int id;
    private double tarifa;
    private double tarifa_bVermelha;
    private double tarifa_Iluminacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getTarifa_bVermelha() {
        return tarifa_bVermelha;
    }

    public void setTarifa_bVermelha(double tarifa_bVermelha) {
        this.tarifa_bVermelha = tarifa_bVermelha;
    }

    public double getTarifa_Iluminacao() {
        return tarifa_Iluminacao;
    }

    public void setTarifa_Iluminacao(double tarifa_Iluminacao) {
        this.tarifa_Iluminacao = tarifa_Iluminacao;
    }
    
    @Override
    public String toString() {
        return "ValorTarifas{" + "id=" + id + ", tarifa=" + tarifa + ", tarifa_bVermelha=" + tarifa_bVermelha + ", tarifa_Iluminacao=" + tarifa_Iluminacao + '}';
    }
}
