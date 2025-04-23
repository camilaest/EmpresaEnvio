import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.uniquindio.edu.co.poo.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

/**
 * Clase para probar los objetos de tipo soldado
 * @author Robinson arias Muñuz
 * @since 2025-04
 *
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
public class EmpresaTest {


    /**
     * Instancia para el manejo de logs
     */

    Empresa empresa = null;

    @BeforeEach
    public void iniciailziar() {
        empresa = new Empresa("Amazon", "EEUU");
    }


    @Test


    public void obtenerEnviosPesoMayor50(){
        Cliente cliente1 = new Cliente ("Camila", "1096", "camiest@", "Tebaida");

        Ruta ruta1 = new Ruta(3, 5.9);
        Motocicleta motocicleta = new Motocicleta("123", "motocicleta", "345", "5", TipoCilindraje.BAJA);
        Envio envio1 = new Envio("envio1", 0, LocalDate.now(),cliente1, ZonaEntrega.URBANA, ruta1, motocicleta);
        empresa.registrarVehiculo(motocicleta);

        Paquete paquete1 = new Paquete ("123", 30);
        Paquete paquete2 = new Paquete ("587", 20);
        Paquete paquete3 = new Paquete ("876", 10);

        envio1.registrarPaquete(paquete1);
        envio1.registrarPaquete(paquete2);
        envio1.registrarPaquete(paquete3);

        empresa.registrarEnvio(envio1);


        ArrayList<Envio> listaEnviosPesoMayor50 = empresa.obtenerEnviosPesoMayor50();

        ArrayList<Envio> listaAux = new ArrayList<>();

        listaAux.add(envio1);

        assertIterableEquals(listaAux,listaEnviosPesoMayor50);

    }
}