package Aula03.Ex04;

public class Funcionario implements FuncionarioInterface {
    private String nome;
    private double salario;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public double getGastos() {
        return getSalario();
    }

    public String getInfo() {
        return "Nome: " + nome + ", com salario = " + salario;
    }
}