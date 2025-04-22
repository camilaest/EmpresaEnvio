package org.uniquindio.edu.co.poo.model;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private String direccion;
    private ArrayList<Vehiculo> listaVehiculos;
    private ArrayList<Envio> listaEnvios;
    private ArrayList<Cliente> listaClientes;


    public Empresa(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaVehiculos = new ArrayList<>();
        this.listaEnvios = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Vehiculo> getListaVehiculos(){
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos){
        this.listaVehiculos = listaVehiculos;
    }

    public ArrayList<Envio> getListaEnvios(){
        return listaEnvios;
    }

    public void setListaEnvios(ArrayList<Envio> listaEnvios){
        this.listaEnvios = listaEnvios;
    }

    public ArrayList<Cliente> getListaClientes(){
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes){
        this.listaClientes = listaClientes;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", listaVehiculos=" + listaVehiculos +
                ", listaEnvios=" + listaEnvios +
                ", listaClientes=" + listaClientes +
                '}';
    }

    //REGISTRAR VEHICULO

    public void registrarVehiculo(Vehiculo vehiculo){
        listaVehiculos.add(vehiculo);
    }

    //REGISTRAR ENVIO
    public void registrarEnvio(Envio nuevoEnvio){
        listaEnvios.add(nuevoEnvio);
    }

    //REGISTRAR CLIENTE
    public String registrarCliente(Cliente miCliente){

        String cedula = miCliente.getCedula();
        String mensaje= "";



        if(buscarCliente(cedula)){// ya existe en el sistema
            mensaje = "El Cliente ya existe en el sistema";
            return mensaje;
        }

        listaClientes.add(miCliente);
        mensaje = "El Cliente fue registrado exitosamente";
        return mensaje;

    }

    private boolean buscarCliente(String cedula) {
        boolean encontrado = false;

        for(Cliente clienteAux : listaClientes){
            if(clienteAux.getCedula().equals(cedula)){
                return true;
            }
        }

        return  encontrado;
    }

    public ArrayList<Envio> obtenerEnviosPesoMayor50(){
        ArrayList<Envio> listaEnviosPesoMayor50= new ArrayList<>();
        for (Envio envioAux : listaEnvios) {
            if(envioAux.sumaPaquetes()>50){
                listaEnviosPesoMayor50.add(envioAux);
            }

        }
        return listaEnviosPesoMayor50;
    }

}
