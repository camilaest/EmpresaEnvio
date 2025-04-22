package org.uniquindio.edu.co.poo.model;

public abstract class Vehiculo {
    private String placa;
    private String nombre;
    private String modelo;

    public Vehiculo (String placa, String nombre, String modelo) {
        this.placa = placa;
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public abstract double calcularCostoTransporte(Envio envio);

}
