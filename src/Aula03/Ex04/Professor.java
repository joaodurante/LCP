package Aula03.Ex04;

class Professor extends Funcionario {
    private int horasDeAula;

    public void setHorasDeAula(int aula){
        horasDeAula = aula;
    }

    public int getHorasDeAula(int aula){
        return horasDeAula;
    }

    public double getGastos(){
        return getSalario() + horasDeAula*10;
    }

    public String getInfo() {
        String infoBasica = super.getInfo();
        String info = infoBasica + ", horas de aula = " + horasDeAula;
        return info;
    }
}