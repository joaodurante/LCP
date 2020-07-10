package Aula05;

class Flores {
    private String nome;
    private String cor;
    private float valor;
    public Flores(String nome, String cor, float valor) {
        this.nome = nome;
        this.cor = cor;
        this.valor = valor;
    }
    public String getNome() {
        return nome;
    }
    public String getCor() {
        return cor;
    }
    public float getValor() {
        return valor;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
}