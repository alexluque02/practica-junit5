package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;


public class TrianguloTest {

    @ParameterizedTest
    @CsvSource({
            "1, 0, 2, NoEsUnTriangulo",
            "0, 3, 2, NoEsUnTriangulo",
            "1, 2, 3, Escaleno",
            "1, 1, 1, Equilatero",
            "5, 2, 5, Isosceles"
    })
    void comprobarTriangulo(int a, int b, int c, TipoTriagulo resultado){
        Triangulo t = new Triangulo();
        assertEquals(resultado, t.tipoDeTriangulo(a, b, c));
    }

}
