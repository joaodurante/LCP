package Aula02.Ex04;

public class Triangulo extends AreaCalculavelAbstract {
    private double tamanho2;

    public Triangulo(double tamanho1, double tamanho2) {
        super(tamanho1);
        this.tamanho2 = tamanho2;
    }

    @Override
    double calculaArea() {
        return (getTamanho1() * tamanho2) / 2;
    }
}
