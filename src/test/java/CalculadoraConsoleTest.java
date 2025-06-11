
import com.iessanalberto.dam1.CalculadoraConsole;
import com.iessanalberto.dam1.Operaciones;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalculadoraConsoleTest {

        private CalculadoraConsole calculadora;

        @Mock
        private Operaciones mockOperaciones;

        @BeforeEach
        public void setUp() {
            MockitoAnnotations.openMocks(this);
            calculadora = new CalculadoraConsole(mockOperaciones);
        }

        @Test
        public void testRealizarSuma() {
            // Configuración
            when(mockOperaciones.calcular(Operaciones.SUMA, 5, 3)).thenReturn(8);

            // Ejecución
            int resultado = calculadora.realizarOperacion(Operaciones.SUMA, 5, 3);

            // Verificación
            assertEquals(8, resultado);
            verify(mockOperaciones).calcular(Operaciones.SUMA, 5, 3);
        }

        @Test
        public void testRealizarDivision() {
            // Configuración
            when(mockOperaciones.calcular(Operaciones.DIVISION, 6, 3)).thenReturn(2);

            // Ejecución
            int resultado = calculadora.realizarOperacion(Operaciones.DIVISION, 6, 3);

            // Verificación
            assertEquals(2, resultado);
            verify(mockOperaciones).calcular(Operaciones.DIVISION, 6, 3);
        }
}


