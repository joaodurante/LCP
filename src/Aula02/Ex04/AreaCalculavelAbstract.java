package Aula02.Ex04;

abstract class AreaCalculavelAbstract{
    private double tamanho1;

    public AreaCalculavelAbstract(double tamanho1){
        setTamanho1(tamanho1);
    }

    public void setTamanho1(Double t){
        this.tamanho1=t;
    }

    public double getTamanho1(){
        return tamanho1;
    }

    abstract double calculaArea();
}