package Aula03.Ex04;

class GeradorDeRelatorio {
    public void geraRelatorio(Funcionario f) {
        System.out.println(f.getInfo());
        System.out.println("Salario final = " + f.getGastos());
    }
}