package Aula03.Ex04;

class TesteFunc{
    public static void main(String[]args){
        Professor prof=new Professor();
        prof.setNome("Prof Jose");
        prof.setSalario(700);
        prof.setHorasDeAula(30);

        Reitor reitor=new Reitor();
        reitor.setNome("Reitor Maria");
        reitor.setSalario(1000);

        ProfessorAssistente profAss = new ProfessorAssistente();
        profAss.setNome("Prof Bob");
        profAss.setSalario(700);
        profAss.setHorasDeAula(10);

        GeradorDeRelatorio relatorio=new GeradorDeRelatorio();
        relatorio.geraRelatorio(prof);
        relatorio.geraRelatorio(reitor);
        relatorio.geraRelatorio(profAss);
    }
}