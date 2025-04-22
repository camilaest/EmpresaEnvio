package org.uniquindio.edu.co.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Envio {

    private String codigo;

    private LocalDate fecha;
    private double totalCosto;
    private ArrayList<Paquete> listaPaquetes;
    private Cliente cliente;
    private ZonaEntrega zonaEntrega;
    private Ruta ruta;
    private Vehiculo vehiculo;


    public Envio(String codigo, double totalCosto, LocalDate fecha, Cliente cliente, ZonaEntrega zonaEntrega, Ruta ruta, Vehiculo vehiculo) {
        this.codigo = codigo;
        this.totalCosto = totalCosto;
        this.fecha = fecha;
        this.listaPaquetes = new ArrayList<>();
        this.cliente = cliente;
        this.zonaEntrega = zonaEntrega;
        this.ruta = ruta;
        this.vehiculo = vehiculo;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getTotalCosto() {
        return totalCosto;
    }
    public void setTotalCosto(double totalCosto) {
        this.totalCosto = totalCosto;
    }

    public ArrayList<Paquete> getListaPaquetes() {
        return listaPaquetes;
    }

    public void setListaPaquetes(ArrayList<Paquete> listaPaquetes) {
        this.listaPaquetes = listaPaquetes;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ZonaEntrega getZonaEntrega() {
        return zonaEntrega;
    }

    public void setZonaEntrega(ZonaEntrega zonaEntrega) {
        this.zonaEntrega = zonaEntrega;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }


    @Override
    public String toString() {
        return "Envio{" +
                "codigo='" + codigo + '\'' +
                ", fecha=" + fecha +
                ", totalCosto=" + totalCosto +
                ", listaPaquetes=" + listaPaquetes +
                ", cliente=" + cliente +
                ", zonaEntrega=" + zonaEntrega +
                ", ruta=" + ruta +
                ", vehiculo=" + vehiculo +
                '}';
    }

    //REGISTRAR Paquete
    public void registrarPaquete(Paquete paquete) {
        listaPaquetes.add(paquete);

    }

    public double sumaPaquetes (){
        double costo =0;
        for (Paquete paqueteAux: listaPaquetes) {
            costo+=paqueteAux.getPeso();
        }
        return costo;
    }

    public double calculartotalcosto(Vehiculo vehiculo) {
        double costoTransporte = this.vehiculo.calcularCostoTransporte(this);
        return costoTransporte;

    }


}
