import com.iessanalberto.dam1.Operaciones;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class OperacionesTest {

        private Operaciones operaciones = new Operaciones();

        @Test
        public void testSuma() {
            assertEquals(5, operaciones.suma(2, 3));
            assertEquals(-1, operaciones.suma(2, -3));
            assertEquals(0, operaciones.suma(0, 0));
        }

        @Test
        public void testResta() {
            assertEquals(1, operaciones.resta(4, 3));
            assertEquals(5, operaciones.resta(2, -3));
            assertEquals(0, operaciones.resta(0, 0));
        }

        @Test
        public void testMultiplicacion() {
            assertEquals(6, operaciones.multiplicacion(2, 3));
            assertEquals(-6, operaciones.multiplicacion(2, -3));
            assertEquals(0, operaciones.multiplicacion(0, 5));
        }

        @Test
        public void testDivision() {
            assertEquals(2, operaciones.division(6, 3));
            assertEquals(-2, operaciones.division(-6, 3));
        }

        @Test
        public void testDivisionPorCero() {
            assertThrows(IllegalArgumentException.class, () -> {
                operaciones.division(5, 0);
            });
        }
}



