package Aula03.Ex05;

public class SalariedEmployee extends EmployeeAbstract{
    private double weeklySalary;

    public SalariedEmployee(String first, String last, String SSN, double salary){
        super(first,last,SSN);
        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary){
        weeklySalary = salary < 0.0 ? 0.0 : salary;
    }

    public double getWeeklySalary(){
        return weeklySalary;
    }

    public String toString(){
       return String.format("Salaried Employee: %s\n%s: $%,.2f",
               super.toString(),"weekly salary",getWeeklySalary());
    }

    public double earnings(){ return getWeeklySalary();}

}