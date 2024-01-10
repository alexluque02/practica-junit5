package org.example;

public class Triangulo {

    public TipoTriagulo tipoDeTriangulo(int a, int b, int c){
        if(a<=0 || b<=0 | c<=0){
            return TipoTriagulo.NoEsUnTriangulo;
        }

        if(a == b && b != c || a == c && c != b || b == c && c != a){
            return TipoTriagulo.Isosceles;
        }

        if(a == b && b == c){
            return TipoTriagulo.Equilatero;
        }

        if(a != b && b != c && a!= c){
            return TipoTriagulo.Escaleno;
        }

        return TipoTriagulo.NoEsUnTriangulo;
    }

}
