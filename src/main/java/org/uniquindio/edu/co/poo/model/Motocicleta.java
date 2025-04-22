package org.uniquindio.edu.co.poo.model;

public class Motocicleta extends Vehiculo {

    private String  placaMoto;
    private TipoCilindraje tipoCilindraje;

    public Motocicleta(String placaMoto, String nombre, String placa, String modelo, TipoCilindraje tipoCilindraje ) {
        super(nombre, modelo, placa);
        this.placaMoto = placaMoto;
        this.tipoCilindraje = tipoCilindraje;
    }

    public String getPlacaMoto() {
        return placaMoto;
    }

    public void setPlacaMoto(String placaMoto) {
        this.placaMoto = placaMoto;
    }

    public TipoCilindraje getTipoCilindraje() {
        return tipoCilindraje;
    }

    public void setTipoCilindraje(TipoCilindraje tipoCilindraje) {
        this.tipoCilindraje = tipoCilindraje;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "placaMoto='" + placaMoto + '\'' +
                ", tipoCilindraje=" + tipoCilindraje +
                '}';
    }

    public double calcularCostoTransporte(Envio envio) {
        double transporte = 0;

        if (envio.getZonaEntrega() == ZonaEntrega.URBANA) {
            transporte =8000;
            transporte = transporte * envio.getListaPaquetes().size();
        }

        else {
            transporte = 15000;
            transporte = transporte * envio.getListaPaquetes().size();;
        }
        return transporte;
    }


}