package Aula02.Ex04;

public class Circulo extends AreaCalculavelAbstract {
    public Circulo(double tamanho1) {
        super(tamanho1);
    }

    @Override
    double calculaArea() {
        double raio = getTamanho1();
        return Math.PI * (raio * raio);
    }
}
