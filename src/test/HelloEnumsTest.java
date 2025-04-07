package test;

import app.HelloEnumsApp;
import enums.Ordenacion;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class HelloEnumsTest {


        @BeforeAll
        public static void setUpBeforeAll() throws Exception {

        }

        @AfterAll
        public static void tearDownAfterAll() throws Exception {

        }

        @Test
        public void pruebaJUnit() {
            assertTrue(true);
        }

        @Test
        public void testWhenHappyPath() {
                Ordenacion result = HelloEnumsApp.obtenerOrdenCadena1("hola", "Adios");
                assertEquals(Ordenacion.MAYOR, result);

                result = HelloEnumsApp.obtenerOrdenCadena1("Adios", "hola");
                assertEquals(Ordenacion.MENOR, result);

                result = HelloEnumsApp.obtenerOrdenCadena1("casa", "casa");
                assertEquals(Ordenacion.IGUAL, result);

                result = HelloEnumsApp.obtenerOrdenCadena1("Avion", "zorro");
                assertEquals(Ordenacion.MENOR, result);

                result = HelloEnumsApp.obtenerOrdenCadena1("Alba", "Albania");
                assertEquals(Ordenacion.MAYOR, result);

                result = HelloEnumsApp.obtenerOrdenCadena1("Albania", "Alba");
                assertEquals(Ordenacion.MENOR, result);

                result = HelloEnumsApp.obtenerOrdenCadena1("zebra", "zzz");
                assertEquals(Ordenacion.MENOR, result);


        }
}
