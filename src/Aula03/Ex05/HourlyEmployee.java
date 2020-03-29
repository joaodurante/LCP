package Aula03.Ex05;

public class HourlyEmployee extends EmployeeAbstract{
    private double wage; // salário por hora
    private double hours;// horas trabalhadas

    public HourlyEmployee(String first, String last, String SSN, double hourlyWage, double hoursWorked){
        super(first,last,SSN);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }

    public void setWage(double hourlyWage){
        wage=hourlyWage<0.0?0.0:hourlyWage;
    }

    public double getWage(){
        return wage;
    }

    public void setHours(double hoursWorked){
        hours=((hoursWorked >= 0.0) && hoursWorked <= 168) ? hoursWorked : 0.0;
    }

    public double getHours(){
        return hours;
    }

    public String toString(){
        return String.format("Hourly Employee: %s\n%s: $%,.2f; %s $%,.2f",
                super.toString(),"hourly wage",getWage(), "hours worked",getHours());
    }

    public double earnings(){
        if(getHours()<=10) return getWage()*getHours();
        else return 40*getWage()+(getHours()-40)*getWage()*1.5;
    }
}
