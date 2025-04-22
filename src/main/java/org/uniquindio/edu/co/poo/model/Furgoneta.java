package org.uniquindio.edu.co.poo.model;

public class Furgoneta extends Vehiculo{

    private String placaFurgoneta;
    private TipoTransmicion tipoTransmicion;

    public Furgoneta (String placaFurgoneta, TipoTransmicion tipoTransmicion, String nombre, String modelo, String placa){
        super(nombre, modelo, placa);
        this.placaFurgoneta = placaFurgoneta;
        this.tipoTransmicion = tipoTransmicion;
    }

    public String getPlacaFurgoneta() {
        return placaFurgoneta;
    }

    public void setPlacaFurgoneta(String placaFurgoneta) {
        this.placaFurgoneta = placaFurgoneta;
    }

    public TipoTransmicion getTipoTransmicion() {
        return tipoTransmicion;
    }

    public void setTipoTransmicion(TipoTransmicion tipoTransmicion) {
        this.tipoTransmicion = tipoTransmicion;
    }

    @Override
    public String toString() {
        return "Furgoneta{" +
                "placaFurgoneta='" + placaFurgoneta + '\'' +
                ", tipoTransmicion=" + tipoTransmicion +
                '}';
    }

    public double calcularCostoTransporte(Envio envio){
        double transporte = 0;
        transporte= (envio.getRuta().getDistancia()) * (3000);
        transporte=transporte +10000;

        return transporte;

    }
}
