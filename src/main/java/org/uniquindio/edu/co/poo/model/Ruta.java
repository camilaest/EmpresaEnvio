package org.uniquindio.edu.co.poo.model;

public class Ruta {

    private int peajes;
    private double distancia;

    public Ruta(int peajes, double distancia) {
        this.peajes = peajes;
        this.distancia = distancia;
    }

    public int getPeajes() {
        return peajes;
    }

    public void setPeajes(int peajes) {
        this.peajes = peajes;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "peajes=" + peajes +
                ", distancia=" + distancia +
                '}';
    }
}
