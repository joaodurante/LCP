package Aula02.Ex03;

public class Triangulo implements AreaCalculavel {
    private double altura, base;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calculaArea() {
        return (base * altura) / 2;
    }
}
