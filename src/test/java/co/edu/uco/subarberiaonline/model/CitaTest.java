package co.edu.uco.subarberiaonline.model;

import co.edu.uco.subarberiaonline.model.businessexception.CitaUnUsuarioBarberiasDiferentesFechaHoraIgualesException;
import co.edu.uco.subarberiaonline.model.mensaje.Mensaje;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CitaTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    Cita cita1;
    Cita cita2;

    @Before
    public void setUp(){
        cita1 = new Cita();
        cita2 = new Cita();
    }

    @Test
    public void generarDosCitasBarberiasDiferentesMismaHoraFecha() throws CitaUnUsuarioBarberiasDiferentesFechaHoraIgualesException{
        exception.expect(CitaUnUsuarioBarberiasDiferentesFechaHoraIgualesException.class);
        exception.expectMessage(Mensaje.Cita.CITA_INVALIDA);
        cita1.getUsuario().setId((long) 1);
        cita2.getUsuario().setId((long) 1);
        cita1.getBarberia().setId((long) 1);
        cita2.getBarberia().setId((long) 1);
        //cita1.setFecha(2019,8,19);
        //cita2.setFecha(2019,8,19);
        cita1.setHora("6:00");
        cita2.setHora("6:00");

    }
}
