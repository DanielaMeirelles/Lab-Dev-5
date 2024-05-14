package test;

import org.junit.jupiter.api.Test;

import main.Triangulo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrianguloTest {
	
	@Test
    public void testTrianguloEscalenoValido() {
        assertEquals(Triangulo.TipoTriangulo.ESCALENO, Triangulo.verificarTriangulo(3, 4, 5));
    }

    @Test
    public void testTrianguloIsoscelesValido() {
        assertEquals(Triangulo.TipoTriangulo.ISOSCELES, Triangulo.verificarTriangulo(5, 5, 3));
    }

    @Test
    public void testTrianguloEquilateroValido() {
        assertEquals(Triangulo.TipoTriangulo.EQUILATERO, Triangulo.verificarTriangulo(6, 6, 6));
    }

    @Test
    public void testIsoscelesValidoPermutacao1() {
        assertEquals(Triangulo.TipoTriangulo.ISOSCELES, Triangulo.verificarTriangulo(3, 3, 5));
    }

    @Test
    public void testIsoscelesValidoPermutacao2() {
        assertEquals(Triangulo.TipoTriangulo.ISOSCELES, Triangulo.verificarTriangulo(3, 5, 3));
    }

    @Test
    public void testIsoscelesValidoPermutacao3() {
        assertEquals(Triangulo.TipoTriangulo.ISOSCELES, Triangulo.verificarTriangulo(5, 3, 3));
    }

    @Test
    public void testValorZero() {
        assertEquals(Triangulo.TipoTriangulo.INVALIDO, Triangulo.verificarTriangulo(0, 4, 5));
    }

    @Test
    public void testValorNegativo() {
        assertEquals(Triangulo.TipoTriangulo.INVALIDO, Triangulo.verificarTriangulo(-3, 4, 5));
    }

    @Test
    public void testSomaDoisLadosIgualAoTerceiroLado() {
        assertEquals(Triangulo.TipoTriangulo.INVALIDO, Triangulo.verificarTriangulo(3, 4, 7));
    }

    @Test
    public void testSomaDoisLadosIgualAoTerceiroLadoPermutacao1() {
        assertEquals(Triangulo.TipoTriangulo.INVALIDO, Triangulo.verificarTriangulo(3, 7, 4));
    }

    @Test
    public void testSomaDoisLadosIgualAoTerceiroLadoPermutacao2() {
        assertEquals(Triangulo.TipoTriangulo.INVALIDO, Triangulo.verificarTriangulo(7, 3, 4));
    }

    @Test
    public void testSomaDoisLadosMenorQueTerceiroLado() {
        assertEquals(Triangulo.TipoTriangulo.INVALIDO, Triangulo.verificarTriangulo(3, 4, 10));
    }

    @Test
    public void testSomaDoisLadosMenorQueTerceiroLadoPermutacao1() {
        assertEquals(Triangulo.TipoTriangulo.INVALIDO, Triangulo.verificarTriangulo(3, 10, 4));
    }

    @Test
    public void testSomaDoisLadosMenorQueTerceiroLadoPermutacao2() {
        assertEquals(Triangulo.TipoTriangulo.INVALIDO, Triangulo.verificarTriangulo(10, 3, 4));
    }

    @Test
    public void testTresValoresIguaisZero() {
        assertEquals(Triangulo.TipoTriangulo.INVALIDO, Triangulo.verificarTriangulo(0, 0, 0));
    }

}
