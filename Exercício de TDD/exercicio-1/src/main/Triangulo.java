package main;

public class Triangulo {
	
	public enum TipoTriangulo {
        EQUILATERO,
        ISOSCELES,
        ESCALENO,
        INVALIDO
    }
	
	public static TipoTriangulo verificarTriangulo(int lado1, int lado2, int lado3) {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0)
            return TipoTriangulo.INVALIDO;

        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1)
            return TipoTriangulo.INVALIDO;

        if (lado1 == lado2 && lado2 == lado3)
            return TipoTriangulo.EQUILATERO;
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
            return TipoTriangulo.ISOSCELES;
        else
            return TipoTriangulo.ESCALENO;
    }

}
