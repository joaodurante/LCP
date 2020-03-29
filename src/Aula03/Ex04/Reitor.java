package Aula03.Ex04;

class Reitor extends Funcionario {
    private int gratificacao = 500;

    public String getInfo() {
        return super.getInfo() + " e ele eh um reitor";
    }

    public double getGastos () {
        return getSalario() + gratificacao;
    }
}