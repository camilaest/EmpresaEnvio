import org.junit.jupiter.api.Test;
import org.uniquindio.edu.co.poo.model.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnvioTest {


    @Test

    public void testCalcularTotalCosto(){
        Camion camion = new Camion (18.0, "234", "camion4", "camion");
        Cliente cliente2 = new Cliente ("Santy", "100744", "santa@", "Armenia");
        Ruta ruta2 = new Ruta(2, 6.8);

        Envio envio2= new Envio ("envio2", 0, LocalDate.now(),cliente2, ZonaEntrega.RURAL, ruta2, camion);

        double costoEsperado = camion.calcularCostoTransporte(envio2);  // usa la lógica definida en Camion
        double costoObtenido = envio2.calculartotalcosto(camion);

        assertEquals(costoEsperado, costoObtenido);


    }




}
