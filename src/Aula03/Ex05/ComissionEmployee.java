package Aula03.Ex05;

public class ComissionEmployee extends EmployeeAbstract{
    private double weeklySalary;

    public ComissionEmployee(String first, String last, String SSN, double vendasSemanais, double comissao){
        super(first,last,SSN);
        setWeeklySalary(vendasSemanais, comissao);
    }

    public void setWeeklySalary(double vendasSemanais, double comissao){
        vendasSemanais = vendasSemanais > 0 ? vendasSemanais : 0;
        comissao = comissao > 0 && comissao <= 1 ? comissao : 0;
        weeklySalary = vendasSemanais * comissao;
    }

    public double getWeeklySalary(){
        return weeklySalary;
    }

    public String toString(){
        return String.format("Comissioned Employee: %s\n%s: $%,.2f",
                super.toString(),"weekly salary",getWeeklySalary() );
    }

    public double earnings(){
        return getWeeklySalary();
    }
}