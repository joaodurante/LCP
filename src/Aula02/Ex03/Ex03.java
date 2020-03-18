package Aula02.Ex03;

public class Ex03 {
    public static void main(String[] args) {
        // Circulo
        double raio = 2;
        Circulo circulo = new Circulo(raio);
        System.out.format("Area do circulo de raio %.2f: %.2f", raio, circulo.calculaArea());

        //Quadrado
        double lado = 2;
        Quadrado quadrado = new Quadrado(lado);
        System.out.format("\nArea do quadrado de lado %.2f: %.2f", lado, quadrado.calculaArea());

        //Triangulo
        double altura = 3;
        double base = 6;
        Triangulo triangulo = new Triangulo(altura, base);
        System.out.format("\nArea do triangulo de altura %.2f e base %.2f: %.2f", altura, base, triangulo.calculaArea());

        //Retangulo
        double lado1 = 3;
        double lado2 = 2;
        Retangulo retangulo = new Retangulo(lado1, lado2);
        System.out.format("\nArea do retangulo de lado1 %.2f e lado2 %.2f: %.2f", lado1, lado2, retangulo.calculaArea());
    }
}
