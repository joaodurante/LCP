package Aula02.Ex04;

public class Quadrado extends AreaCalculavelAbstract {
    public Quadrado(double tamanho1) {
        super(tamanho1);
    }

    @Override
    double calculaArea() {
        return getTamanho1() * getTamanho1();
    }
}
