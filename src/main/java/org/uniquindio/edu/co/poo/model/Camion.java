package org.uniquindio.edu.co.poo.model;

public class Camion extends Vehiculo{

    private double capacidadCarga;

    public Camion(double capacidadCarga, String placa, String modelo, String nombre) {
        super(placa, modelo, nombre);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "capacidadCarga=" + capacidadCarga +
                '}';
    }

    public double calcularCostoTransporte (Envio envio){
        double transporte=0;
        double peajestotal = 0;
        double peso=0;
        peajestotal = envio.getRuta().getPeajes() * 12000;
        peso = envio.sumaPaquetes() * 7000;
        transporte = peajestotal + peso;

        return transporte;
    }

}
