package es.upm.grise;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ClaseExamenTest{
    static Stream<Arguments> entradas(){
        return Stream.of(
            Arguments.of(6, Arrays.asList(2, 3)),
            Arguments.of(13, Arrays.asList(13)),
            Arguments.of(15, Arrays.asList(3, 5)),
            Arguments.of(25, Arrays.asList(5, 5))
        );
    }

    @ParameterizedTest
    @MethodSource("entradas")
    @DisplayName("Test de entradas validas para el método 'primos()'")
    void test_primos_entrada_valida(int n, List<Integer> salidaEsperada) throws EntradaInvalida{
        assertEquals(salidaEsperada, ClaseExamen.primos(n));
    }

    @Test
    @DisplayName("Test de entrada invalidas para el método 'primos()'")
    void test_entrada_invalida() throws EntradaInvalida{
        int nInvalido = -1;
        assertThrows(EntradaInvalida.class, () -> {ClaseExamen.primos(nInvalido);});
    }
}
