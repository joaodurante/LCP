package Test01;

import java.sql.Array;
import java.util.Scanner;

class Carro {
    private int id;
    private int ordemChegada;
    private int nroVaga;

    public Carro(int idC, int ordemC, int vagaC){
        setID(idC);
        setordemChegada(ordemC);
        setnroVaga(vagaC);}

    public void setID(int idCarro) {
        id = idCarro;}
    public void setordemChegada(int ordemCarro) {
        ordemChegada = ordemCarro;}
    public void setnroVaga(int vagaCarro) {
        nroVaga = vagaCarro;}
    public int getID() {
        return id;}
    public int getordemChegada() {
        return ordemChegada;}
    public int getnroVaga() {
        return nroVaga;}
    public void mostraCarro(){
        System.out.printf ("Vaga = %d - id = %d, ordem de chegada = %d\n", nroVaga, id, ordemChegada);
    }
}

class P1Bas01{
    Carro[] estacionamento;
    final int tamanho = 20;

    public P1Bas01(){
        estacionamento = new Carro[tamanho];}

    public int menu(){
        Scanner dado = new Scanner(System.in);
        System.out.println("\nFaça sua escolha: ");
        System.out.println("1. Adicionar carro ");
        System.out.println("2. Remover carro ");
        System.out.println("3. Mostrar estacionamento ");
        System.out.println("4. Sair ");
        return dado.nextInt();
    }

    public int temVagas(){
        for(int i=0; i < this.tamanho; i++) {
            if(this.estacionamento[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public boolean adiciona(int ordem){
        for(int i=0; i<this.tamanho; i++){
            if(this.estacionamento[i] == null) {
                int id = this.getId();
                this.estacionamento[i] = new Carro(id, ordem, i);
                return true;
            }
        }
        System.out.println("Nao ha vagas disponiveis");
        return false;
    }

    private int getId() {
        Scanner scanner = new Scanner(System.in);
        int id;
        while(true) {
            System.out.println("Insira o valor do id: ");
            try {
                id = new Scanner(System.in).nextInt();
                if((int)id == id){
                    return id;
                }
            } catch (Exception e) {
                System.out.println("Valor invalido, digite novamente!");
            }
        }
    }

    public int remove(){
        int id = this.getId();
        for(int i=0; i<this.tamanho; i++){
            if(this.estacionamento[i].getID() == id) {
                this.estacionamento[i] = null;
                return id;
            }
        }
        return -1;
    }

    public void mostra(){
        for(int i=0; i<this.tamanho; i++) {
            if(estacionamento[i] != null) {
                System.out.println("Numero da vaga: " + i + ". ID: " + estacionamento[i].getID() + ". Ordem de chegada: " + estacionamento[i].getordemChegada());
            }
        }
    }

    public static void main(String[] args){
        P1Bas01 show = new P1Bas01();
        int id, ordem=1, menu;

        do{
            menu = show.menu();
            switch (menu){
                case 1: if(show.adiciona(ordem)) ordem++;
                    break;
                case 2: if((id=show.remove())!=-1)
                    System.out.println("Remoção com sucesso de ..."+id);
                    break;
                case 3: show.mostra(); break;
            }
        }while (menu!=4);
    }
}


