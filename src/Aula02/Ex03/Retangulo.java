package Aula02.Ex03;

public class Retangulo implements AreaCalculavel {
    private double lado1, lado2;

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calculaArea() {
        return lado1 * lado2;
    }
}
