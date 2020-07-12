package Aula06;

abstract class Animal {
    private String nome;
    public Animal(){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public abstract void emitirSom();
}

class Passaro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Piu piu");
    }
}

class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
}

class Tartaruga extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Nhack");
    }
}

class Veterinario {
    public void examinar(Animal animal){
        animal.emitirSom();
    }
}




class OperacoesMatrizes {
    public float elementosColuna1(float[][] mat, int N, int col) {
        float sum = 0;
        for(int i=0; i<N; i++) {
            sum += mat[i][col];
        }
        return sum;
    }

    public float elementosLinha2(float[][] mat, int N, int lin) {
        float mult = 1;
        for(int i=0; i<N; i++){
            mult *= mat[lin][i];
        }
        return mult;
    }
}