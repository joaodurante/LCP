package Aula05;

import java.util.ArrayList;

public class Bouquet {
    ArrayList<Flores> flores;

    public Bouquet(ArrayList<Flores> flores) {
        this.flores = flores;
    }

    public Integer count(){
        return flores.size();
    }

    public Integer count(String color) {
        Integer count = 0;
        for(Flores flor: flores){
            if(flor.getCor() == color)
                count++;
        }
        return count;
    }
}
