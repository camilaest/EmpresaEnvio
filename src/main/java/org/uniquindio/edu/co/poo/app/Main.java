package org.uniquindio.edu.co.poo.app;

import org.uniquindio.edu.co.poo.model.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Amazon", "EEUU");

        Cliente cliente1 = new Cliente ("Camila", "1096", "camiest@", "Tebaida");
        Cliente cliente2 = new Cliente ("Santy", "100744", "santa@", "Armenia");




        Ruta ruta1 = new Ruta(3, 5.9);
        Ruta ruta2 = new Ruta(2, 6.8);


        Motocicleta motocicleta = new Motocicleta("123", "motocicleta", "345", "5", TipoCilindraje.BAJA);
        Camion camion = new Camion (18.0, "234", "camion4", "camion");


        Envio envio1 = new Envio("envio1", 0, LocalDate.now(),cliente1, ZonaEntrega.URBANA, ruta1, motocicleta);
        Envio envio2= new Envio ("envio2", 0, LocalDate.now(),cliente2, ZonaEntrega.RURAL, ruta2, camion);


        empresa.registrarVehiculo(motocicleta);
        empresa.registrarVehiculo(camion);





        Paquete paquete1 = new Paquete ("123", 30);
        Paquete paquete2 = new Paquete ("587", 20);
        Paquete paquete3 = new Paquete ("876", 10);
        Paquete paquete4 = new Paquete ("965", 6.7);



        envio1.registrarPaquete(paquete1);
        envio1.registrarPaquete(paquete2);
        envio1.registrarPaquete(paquete3);
        envio2.registrarPaquete(paquete4);


        //System.out.println(envio1);
        //System.out.println(envio2);

        empresa.registrarEnvio(envio1);
        empresa.registrarEnvio(envio2);



        empresa.registrarCliente(cliente1);
        empresa.registrarCliente(cliente2);



        //System.out.println(empresa);

        //System.out.println(envio1.calculartotalcosto(motocicleta));

        envio1.setTotalCosto(envio1.calculartotalcosto(motocicleta));
        //System.out.println(envio1.getTotalCosto());


        envio2.setTotalCosto(envio2.calculartotalcosto(camion));
        //System.out.println(envio2.getTotalCosto());

        System.out.println(empresa.obtenerEnviosPesoMayor50());
    }
}