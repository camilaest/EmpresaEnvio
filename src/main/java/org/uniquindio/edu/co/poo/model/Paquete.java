package org.uniquindio.edu.co.poo.model;

public class Paquete {

    private String codigo;
    private double peso;


    public Paquete(String codigo, double peso) {
        this.codigo = codigo;
        this.peso = peso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "codigo='" + codigo + '\'' +
                ", peso=" + peso +
                '}';
    }
}
